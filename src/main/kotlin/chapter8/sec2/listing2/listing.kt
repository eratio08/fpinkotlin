package chapter8.sec2.listing2

import io.kotlintest.properties.Gen

val listing2 = {
    //tag::init[]
    fun <A> listOf(a: Gen<A>): List<Gen<A>> = TODO()
    //end::init[]
}
