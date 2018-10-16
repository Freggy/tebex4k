package de.freggy.tebex4k.data

/**
 * @property iso_4217
 * @property symbol
 */
data class Currency(val iso_4217: String, val symbol: String)

/**
 * @property id
 * @property domain
 * @property name
 * @property currency
 * @property onlineMode
 */
data class Account(val id: Int, val domain: String, val name: String, val currency: Currency, val onlineMode: Boolean)

/**
 * @property id
 * @property name
 */
data class Server(val id: Int, val name: String)

/**
 * @property account
 * @property server
 */
data class AccountInformation(val account: Account, val server: Server)