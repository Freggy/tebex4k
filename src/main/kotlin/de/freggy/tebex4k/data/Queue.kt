package de.freggy.tebex4k.data

import com.fasterxml.jackson.annotation.JsonProperty

//
// Player
//

/**
 * @property id
 * @property name
 * @property uuid
 */
data class Player(val id: Int, val name: String, val uuid: String)


//
// Due Players
//

/**
 * @property executeOffline
 * @property nextCheck
 * @property more
 */
data class DuePlayersMetaObject(val executeOffline: Boolean, val nextCheck: Int, val more: Boolean)

/**
 * @property players
 * @property meta
 */
data class DuePlayers(val players: List<Player>, val meta: DuePlayersMetaObject)

//
// Command
//

/**
 * @property delay
 * @property slots
 */
data class Conditions(val delay: Int, val slots: Int)

/**
 * @property id
 * @property command
 * @property payment
 * @property packageId
 * @property player
 */
data class Command(
        val id: Int,
        val command: String,
        val payment: Int,
        @JsonProperty("package") val packageId: Int,
        val conditions: Conditions,
        val player: Player
)

//
// Offline Command
//

/**
 * @property commands
 * @property meta
 */
data class OfflineCommands(val commands: List<Command>, val meta: OfflineCommandsMetaObject)

/**
 * @property limited
 */
data class OfflineCommandsMetaObject(val limited: Boolean)

//
// Online Command
//

/**
 * @property commands
 */
data class OnlineCommands(val commands: List<Command>)