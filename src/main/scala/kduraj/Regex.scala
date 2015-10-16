package kduraj

/**
 * Created by kevin1 on 10/13/15.
 */
object Regex {

  def apply(str: String): Unit = {

    val regex = """(\d+)(.*)""".r
    str match {
      case regex(age, name) => println(age)
      case _ => println("decimal number not found")
    }
  }

}
