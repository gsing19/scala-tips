package kduraj

/**
 * Created by kevin1 on 10/12/15.
 */

object ClassMatch {

  case class Person(age: Int)

  val person = Option(Person(100))

  val res0 = person.map(_.age + 5 )
  println("res0: " + res0 )

  val person2: Option[Person] = Option(null)
  val age2 = person2.map(_.age + 5 )
  val res1 = age2.getOrElse(0)
  println("res1: " + res1 )

  val res2 = age2.getOrElse({Thread.sleep(1000); 2})
  println("res2: " + res2 )

  //findPersonById(123).map(_.age).getOrElse(0)

  def doStuff(p:Option[Person]) = p match {
    case Some(person) => println("here is " + person)
    case None => println("No person")
  }

  doStuff(person)
  doStuff(person2)


}
