import assertk.Assert
import assertk.Result
import assertk.assertions.isSuccess
import assertk.assertions.support.expected

fun <T> Assert<Result<T>>.isSuccessAnd(assertion: (T) -> Unit) = isSuccess().transform { actual ->
    with(actual) {
        this ?: expected("a concrete value but the value was null!")
        assertion(this)
    }
}
