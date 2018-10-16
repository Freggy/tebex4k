package de.freggy.tebex4k

import de.freggy.tebex4k.data.AccountInformation
import org.http4k.client.AsyncHttpClient
import org.http4k.core.Body
import org.http4k.core.Response


/**
 * Created by Yannic Rieger on 06.10.2018.
 *
 * @author Yannic Rieger
 */
class TebexAsyncHttpClient(private val token: String, private val handler: AsyncHttpClient) {

    fun getAccountInformation(consumer: (AccountInformation) -> Unit) {
        this.handler(Body.EMPTY GET ("" with this.token)) { consumer(it.accountInformation()) }
    }

}