package kduraj

object Main extends App {

  //anagrams
  //multiply()
  //stringGroupBy()
  stringSorted()

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

  def stringGroupBy(): Unit = {
    val strings = List("kanan", "kevin", "testing", "ken", "test1")
    val byLength = strings.groupBy(_.length)

    val res0 = byLength(5)
    println("res0: " + res0)

    val res1 = byLength(7)
    println("res1: " + res1)

    val byChar = strings.groupBy(_.charAt(0))
    val res2 = byChar('k')
    println("res2: " + res2)


  }


  def stringSorted(): Unit = {
    val str = "aSdF"
    val res0 = str.getClass()
    println("res0: " + res0)

    val res1 = str.sorted
    println("res1 " + res1)

    val res2 = str.filter(_.isUpper)
    println("res2 " + res2)

  }

  def anagrams(): Unit = {
    val words = List("kitchen", "thicken", "the", "ababab", "testing", "bababa")
    val result = words.filter(_.length > 4).groupBy(_.sorted).values
    result.foreach(println)

  }

}