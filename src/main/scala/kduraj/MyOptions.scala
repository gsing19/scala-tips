package kduraj

/**
 * Created by kevin1 on 10/12/15.
 */

class MyOptions {

  case class Person(age: Int)

  val person = Option(Person(100))

  val res0 = person.map(_.age + 5 )
  println("res0: " + res0 )

  val person2: Option[Person] = Option(null)
  val age2 = person2.map(_.age + 5 )
  val res1 = age2.getOrElse(0)
  println("res1: " + res1 )

  //findPersonById(123).map(_.age).getOrElse(0)
  

}
