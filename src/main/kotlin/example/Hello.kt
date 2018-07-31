package example

import com.github.kittinunf.fuel.Fuel

fun main(args: Array<String>) {
    val result = Fuel.post("http://httpbin.org/post", listOf("key1" to "value1")).responseString()
    println("------------- request ---------------")
    println(result.first)

    println("--------------- response -----------------")
    println(result.second)

    println("--------------- third ------------------")
    println(result.third)
}
