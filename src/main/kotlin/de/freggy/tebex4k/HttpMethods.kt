package de.freggy.tebex4k

import org.http4k.core.Body
import org.http4k.core.Request

/**
 * Created by Yannic Rieger on 06.10.2018.
 * <p>
 * @author Yannic Rieger
 */

infix fun Body.PUT(param: Pair<String, String>): Request {

}

infix fun String.with(s: String): Pair<String, String> {
    return Pair(this, s)
}