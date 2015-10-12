package kduraj

import com.sun.deploy.util.StringUtils

/**
 * Created by kevin1 on 10/12/15.
 */
class MyStrings {


  trait Person {
    def first: String
    def last: String
  }

  case class Student(first: String, last:String) extends Person
  case class SuperHero(first: String, last:String) extends Person
  //case class SuperHero(first: String, last:String, superPower: SuperPower) extends Person
  //case class SuperPower(ability: String, powerLevel: Int) extends Person


  def printSuperPower(p:Person): Unit = {

    p match {
      case Student("Kevin", lastName) => println("You are a Kevin " + lastName)
      case Student("John", lastName) => println("You are a John " + lastName)
      case _ => println(p.getClass().getName() + " a have no superpower")
      //case SuperHero(_,_,superPower) => println(p.first + " has " + superPower.ability)

    }
  }
  val s1 = Student("Kevin", "Duraj")
  printSuperPower(s1)

  val s2 = Student("John", "Smith")
  printSuperPower(s2)

  //val sh = SuperHero("Tony", "Stark", SuperPower("super human ", 5))
  //printSuperPower(sh)

}
