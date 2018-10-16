package de.freggy.tebex4k

import org.http4k.client.ApacheAsyncClient
import org.http4k.client.ApacheClient
import org.http4k.client.JavaHttpClient
import org.http4k.core.Body
import org.http4k.core.Response

/**
 * Created by Yannic Rieger on 06.10.2018.
 *
 * @author Yannic Rieger
 */
class Tebex {

    companion object Factory {

        @JvmStatic
        fun async(token: String): TebexAsyncHttpClient {
            return TebexAsyncHttpClient(token, ApacheAsyncClient())
        }

        @JvmStatic
        fun sync(token: String): TebexSyncHttpClient {
            return TebexSyncHttpClient(token, ApacheClient())
        }
    }

}