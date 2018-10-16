package de.freggy.tebex4k

import de.freggy.tebex4k.data.*
import org.http4k.core.Body
import org.http4k.core.Response
import org.http4k.format.Jackson.auto

fun Response.accountInformation() = Body.auto<AccountInformation>().toLens().extract(this)

fun Response.duePlayers() = Body.auto<DuePlayers>().toLens().extract(this)

fun Response.offlineCommands() = Body.auto<OfflineCommands>().toLens().extract(this)

fun Response.onlineCommands() = Body.auto<OnlineCommands>().toLens().extract(this)