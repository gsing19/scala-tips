package kduraj

import java.io.File
import scala.collection.mutable.ListBuffer
import scala.io.Source

/**
 * Basic List, Set, Seq
 */
class BasicList(file: File) {

  /**
   * List - has duplicates
   */
  def read2List(): Unit = {

    var list1 = List[String]()
    var list2 = List[String]()

    Source.fromFile(file).getLines.foreach { line =>
      val col = line.split(",").map(_.trim)
      list1 = list1 :+ col(0) // adds to end of the list
      list2 ::= col(0) // adds to beginning of the list
    }
    println("InOrder : " + list1.toString())
    println("Reverse : " + list2.toString())

  }

  /**
   * Sequence - has duplicates, linear time
   */
  def read2Seq(): Unit = {

    var seq = Seq[String]()
    Source.fromFile(file).getLines.foreach { line =>
      val col = line.split(",").map(_.trim)
      seq = seq :+ col(0)
    }
    println("Sequence: " + seq.toString())

  }

  /**
   * Set - has no duplicates, linear time
   */
  def read2Set(): Unit = {

    var set = Set[String]()

    Source.fromFile(file).getLines.foreach { line =>
      val col = line.split(",").map(_.trim)
      set += col(0)
    }

    println(set.toString())
  }

  /**
   * ListBuffer - constant time
   */
  def read2ListBuffer(): Unit = {

    val buffer1 = ListBuffer[String]()
    val buffer2 = ListBuffer[String]()

    Source.fromFile(file).getLines.foreach { line =>
      val col = line.split(",").map(_.trim)
      buffer1.append(col(0)) // append to buffer
      buffer2.prepend(col(0)) // prepend to buffer
    }
    println("ListBuffer Append  : " + buffer1.toString())
    println("ListBuffer Prepend : " + buffer2.toString())

  }

}

