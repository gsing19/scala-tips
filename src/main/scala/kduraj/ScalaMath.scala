package kduraj

/**
 * Math, sum of integers, power, multiply
 */
object ScalaMath {

  /*----------------------------------------------------------------*/
  def sumOfIntegers(i:Int, j:Int): Unit = {
    val list = (i to j).toList
    val res = list.reduceLeft(_ + _)
    println("sumOfIntegers: " + res)
  }
  /*----------------------------------------------------------------*/
  def powerDigitSum(power: Int): Unit = {

    val res0 = scala.math.pow(2, power).toInt
    val list = res0.toString.map(_.asDigit).toList
    val res1 = list.reduceLeft(_ + _)
    println("powerDigitSum: " + res1)
  }

  /*----------------------------------------------------------------*/
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
  /*----------------------------------------------------------------*/

}
