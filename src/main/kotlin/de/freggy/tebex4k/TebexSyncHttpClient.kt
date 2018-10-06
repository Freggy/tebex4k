package de.freggy.tebex4k

import org.http4k.core.Body
import org.http4k.core.HttpHandler

/**
 * Created by Yannic Rieger on 06.10.2018.
 * <p>
 * @author Yannic Rieger
 */
class TebexSyncHttpClient(private val token: String, private val handler: HttpHandler) : TebexHttpClient {

    fun bla() {
        val resp = handler(Body.EMPTY PUT ("" with this.token))
    }
}