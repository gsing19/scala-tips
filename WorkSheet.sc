import .Person

val list = List('a', 'b', 'c')

3 * 6

case class Person(age: Int)

val person1 = Option(Person(100))
val person2 = Option(null)


var s = Some("abc")
var t: Option[String] = None

if(s isDefined) println("Option is defined")
if(t isEmpty) println("Option is empty")

s match {
  case Some(s) => println("exists")
  case None => println("does not exist")
}




