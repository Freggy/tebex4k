package de.freggy.tebex4k

import org.http4k.client.AsyncHttpClient
import org.http4k.core.Body
import org.http4k.core.HttpHandler
import org.http4k.core.Method
import org.http4k.core.Response


/**
 * Created by Yannic Rieger on 06.10.2018.
 * <p>
 * @author Yannic Rieger
 */
class TebexAsyncHttpClient(private val token: String, private val handler: AsyncHttpClient) : TebexHttpClient {


    fun bla(comsuner: (Response) -> Unit) {
        this.handler(Body.EMPTY PUT ("url" with "token"),  comsuner)
    }

}