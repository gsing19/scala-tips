package kduraj

/**
 * Scala Option
 * isDefined, isEmpty, getOrElse, match
 */
object ScalaOption {

  def apply(): Unit = {

    println("\n--- Empty Option ---")
    stringEmptyOption()

    println("\n--- Get Or Else ---")
    stringGetOrElse()

    println("\n--- Match Option ---")
    stringMatchOption()

    println("\n--- Object Match Option ---")
    objectMatchOption()

  }

  val str1 = Some("abc")
  // Scala can infer the type
  var str2: Option[String] = None // Type must be explicit

  def stringEmptyOption(): Unit = {

    if (str1 isDefined) println(str2)
    if (str2 isEmpty) println("Nothing here!")
  }

  def stringGetOrElse(): Unit = {
    val res = str2.getOrElse("Empty")
    println(res)
  }

  def stringMatchOption(): Unit = {

    str1 match {
      case Some(str1) => println("exist")
      case _ => println("Does not exist")
    }
  }

  def objectMatchOption(): Unit = {

    case class Person(i: Int)
    val person1 = Option(Person(100))
    val person2: Option[Person] = Option(null)

     person1 match {
      case Some(person1) => println("Exist " + person1)
      case None => println("No person")
    }

    person2 match {
      case Some(person1) => println("Exist " + person1)
      case None => println("No person")
    }
  }

}
