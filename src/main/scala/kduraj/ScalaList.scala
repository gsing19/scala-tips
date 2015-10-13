package kduraj

/**
 * Created by kevin1 on 10/13/15.
 */
class ScalaList {

  def doubleIt(number: Int) = number * 2

  def multiply(): Unit = {

    val numbers = List(3, 10, 8, 17)
    val res0 = numbers.map(number => number * 2)
    val res1 = numbers.map(_ * 2)
    val res2 = numbers.map(doubleIt)
    val res3 = numbers.map(_ + " is a number")
    val res4 = numbers.filter(_ > 9)
    res4.foreach(println)

  }


  val res0 = List('a', 'b', 'c', 'd')
  println(res0)
}
