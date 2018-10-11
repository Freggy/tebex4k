package de.freggy.tebex4k

import de.freggy.tebex4k.data.AccountInformation
import org.http4k.client.ApacheClient
import org.http4k.core.Body
import org.http4k.core.HttpHandler

/**
 * Created by Yannic Rieger on 06.10.2018.
 * <p>
 * @author Yannic Rieger
 */
class TebexSyncHttpClient(
        private val token: String,
        private val handler: HttpHandler,
        private val extractor: TebexHttpExtractor
) {

    fun getAccountInformation(): AccountInformation {
        return this.extractor.extractAccountInformation(
                this.handler(Body.EMPTY get ("" with this.token))
        )
    }
}