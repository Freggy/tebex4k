package de.freggy.tebex4k.data

data class Currency(val iso_4217: String, val symbol: String)

data class Account(val id: Int, val domain: String, val name: String, val currency: Currency, val onlineMode: Boolean)

data class Server(val id: Int, val name: String)

data class AccountInformation(val account: Account, val server: Server)