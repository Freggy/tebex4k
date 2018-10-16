package de.freggy.tebex4k

import de.freggy.tebex4k.data.AccountInformation
import de.freggy.tebex4k.data.DuePlayers
import de.freggy.tebex4k.data.OfflineCommands
import de.freggy.tebex4k.data.OnlineCommands
import org.http4k.core.Body
import org.http4k.core.HttpHandler


/**
 * Created by Yannic Rieger on 06.10.2018.
 *
 * @property token secret key used for requesting the Tebex API
 * @property handler used for handling HTTP requests
 *
 * @author Yannic Rieger
 */
class TebexSyncHttpClient(private val token: String, private val handler: HttpHandler) {

    /**
     *
     */
    fun getAccountInformation(): AccountInformation {
        return this.handler(Body.EMPTY GET (INFORMATION_ENDPOINT with this.token)).accountInformation()
    }

    /**
     *
     */
    fun getDuePlayers(): DuePlayers {
        return this.handler(Body.EMPTY GET (DUE_PLAYERS_ENDPOINT with this.token)).duePlayers()
    }

    /**
     *
     */
    fun getOfflineCommands(): OfflineCommands {
        return this.handler(Body.EMPTY GET (OFFLINE_COMMANDS_ENDPOINT with this.token)).offlineCommands()
    }

    /**
     *
     */
    fun getOnlineCommands(playerId: String): OnlineCommands {
        if (playerId.isEmpty() || playerId.isBlank()) throw IllegalArgumentException("playerId cannot be blank or empty.")
        return this.handler(Body.EMPTY GET (ONLINE_COMMANDS_ENDPOINT.replace("{id}", playerId) with this.token)).onlineCommands()
    }
}
