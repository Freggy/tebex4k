package de.freggy.tebex4k

import org.http4k.core.Body
import org.http4k.core.Method
import org.http4k.core.Request

/**
 * Created by Yannic Rieger on 06.10.2018.
 * <p>
 * @author Yannic Rieger
 */

infix fun Body.put(param: Pair<String, String>)
        = Request(Method.PUT, param.first).header("X-Buycraft-Secret", param.second)

infix fun Body.get(param: Pair<String, String>)
        = Request(Method.GET, param.first).header("X-Buycraft-Secret", param.second)



// Wrap 'to' call because 'with' sounds better
infix fun String.with(s: String) = this to s