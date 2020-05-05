package section7.sealed_classes

sealed class Result {
    class Success(val items: List<String>): Result()
    class Failure(val error: Throwable): Result()
    class Cancelled(): Result()
}

fun getResult(res: Result): Any {
    return when(res) {
        is Result.Success -> res.items.toString()
        is Result.Failure -> res.error.printStackTrace()
        is Result.Cancelled -> "Cancelled"
    }
}

fun main(args: Array<String>) {
    val res = Result.Success(listOf("one", "two"))
    println(getResult(res))

    println(getResult(Result.Failure(Throwable())))
}