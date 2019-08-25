package chapter3.exercises

import chapter3.Cons
import chapter3.List
import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec

// tag::init[]
fun <A, B> flatMap(xa: List<A>, f: (A) -> List<B>): List<B> = TODO()

fun <A, B> flatMap2(xa: List<A>, f: (A) -> List<B>): List<B> = TODO()
// end::init[]

class Exercise_3_19 : WordSpec({
    "list flatmap" should {
        "!map and flatten a list" {
            chapter3.solutions.flatMap(List.of(1, 2, 3)) { i -> List.of(i, i) } shouldBe List.of(1, 1, 2, 2, 3, 3)
            chapter3.solutions.flatMap2(List.of(1, 2, 3)) { i -> List.of(i, i) } shouldBe List.of(1, 1, 2, 2, 3, 3)
        }
    }
})