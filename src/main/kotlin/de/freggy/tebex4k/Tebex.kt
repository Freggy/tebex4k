package de.freggy.tebex4k

import org.http4k.client.ApacheAsyncClient
import org.http4k.client.ApacheClient
import org.http4k.client.JavaHttpClient
import org.http4k.core.Body
import org.http4k.core.Response

/**
 * Created by Yannic Rieger on 06.10.2018.
 * <p>
 * @author Yannic Rieger
 */
class Tebex {

    companion object Factory {

        fun async(token: String): TebexHttpClient {
            return TebexAsyncHttpClient(token, ApacheAsyncClient())
        }

        fun sync(token: String): TebexHttpClient {
            return TebexSyncHttpClient(token, ApacheClient())
        }
    }

}