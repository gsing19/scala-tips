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

  }

  val str1 = Some("abc") // Scala can infer the type
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

    str2 match {
      case Some(t) => println("exist")
      case _ => println("Does not exist")
    }
  }

}
