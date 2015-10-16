package kduraj

object Strings {

  def apply(): Unit = {

    println("\n--- Sorting strings ---")
    stringSorted()
    println("\n--- Anagrams ---")
    anagrams()
    println("\n--- Find people ---")
    findPeople()
    println("\n--- String group by ---")
    stringGroupBy()

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


  def findPeople(): Unit = {
    val people = List("kevin", "thomas", "duraj")
    val names = List("kevin", "jen")

    val matchingPeople = people.filter(p => names.exists(p.contains))
    println(matchingPeople)

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

}
