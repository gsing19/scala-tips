package kduraj

/**
 * Scala Options
 */
object ScalaOption {

  var str1 = Some("abc")          // Scala can infer the type
  var str2: Option[String] = None // Type must be explicit

  str2 match {
    case Some(t) => println("exist")
    case _ =>    println("Does not exist")
  }


  if (str1 isDefined) println(str2)
  if (str2 isEmpty) println("Nothing here!")

  val w = str2.getOrElse("Empty")
  println(w)

  str2 = Some("Kevin Thomas Duraj")
  println(str2 map(_.toString) filter(_.length > 0) map(_.toUpperCase))

}
