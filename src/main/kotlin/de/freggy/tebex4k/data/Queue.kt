package de.freggy.tebex4k.data

import com.fasterxml.jackson.annotation.JsonProperty

data class Player(val id: Int, val name: String, val uuid: String)


//
// Due Players
//

data class DuePlayersMetaObject(val executeOffline: Boolean, val nextCheck: Int, val more: Boolean)

data class DuePlayers(val players: List<Player>, val meta: DuePlayersMetaObject)

//
// Offline Command
//

data class OfflineCommandsMetaObject(val limited: Boolean)

data class Conditions(val delay: Int, val slots: Int)

data class Command(
        val id: Int,
        val command: String,
        val payment: Int,
        @JsonProperty("package") val packageId: Int,
        val conditions: Conditions,
        val player: Player
)
