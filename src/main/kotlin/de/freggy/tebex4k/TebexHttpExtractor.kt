package de.freggy.tebex4k

import de.freggy.tebex4k.data.AccountInformation
import org.http4k.core.Body
import org.http4k.core.Response
import org.http4k.format.Jackson.auto

class TebexHttpExtractor {

    fun extractAccountInformation(response: Response) = Body.auto<AccountInformation>().toLens().extract(response)

}