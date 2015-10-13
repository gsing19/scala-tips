package kduraj

import java.io.File
import scala.collection.mutable
import scala.collection.immutable.TreeMap
import scala.io.Source

/**
 * Reading data into Map, HashMap, ListMap, TreeMap
 */
class BasicMaps(file: File) {

  /**
   * Map mutable
   */
  def read2Map(): Unit = {

    val map = mutable.Map[String, Int]()

    Source.fromFile(file).getLines.foreach { line =>
      val col = line.split(",").map(_.trim)

      if (map.getOrElse(col(0), null) == null) {
        map += (col(0) -> col(1).toInt)
      } else { //incrementing duplicate key values
        map.update(col(0), map(col(0)) + 1 )
      }
    }

    println("Map: " + map.toString())
  }

  /**
   * HashMap mutable
   */
  def read2HashMap(): Unit = {

    val hash = mutable.HashMap[String, Int]()

    Source.fromFile(file).getLines.foreach { line =>
      val col = line.split(",").map(_.trim)

      if (hash.getOrElse(col(0), null) == null) {
        hash += (col(0) -> col(1).toInt)
      } else { //incrementing duplicate key values
        hash.update(col(0), hash(col(0)) + 1 )
      }
    }

    println("HashMap: " + hash.toString())
  }

  /**
   * ListMap mutable
   */
  def read2ListMap(): Unit = {

    val list = mutable.ListMap[String, Int]()

    Source.fromFile(file).getLines.foreach { line =>
      val col = line.split(",").map(_.trim)

      if (list.getOrElse(col(0), null) == null) {
        list += (col(0) -> col(1).toInt)
      } else { //incrementing duplicate key values
        list.update(col(0), list(col(0)) + 1 )
      }
    }

    println("ListMap: " + list.toString())
  }

  /**
   * TreeMap immutable
   */
  def read2TreeMap(): Unit = {

    var tree = TreeMap[String, Int]()

    Source.fromFile(file).getLines.foreach {
      line =>
        val col = line.split(",").map(_.trim)

        if (tree.getOrElse(col(0), null) == null) {
          tree += (col(0) -> col(1).toInt)
        } else { //incrementing duplicate key values
        val i = tree(col(0)) + 1
          tree += (col(0) -> i)
        }
    }

    println("TreeMap: " + tree.toString())
  }

}

