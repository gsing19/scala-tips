package kduraj

import scala.collection.mutable

/**
 * Find duplicate words within the string
 */
object FindDuplicates {

  val string = """the quick brown foxes jumped over The lazy Dogs"""
  val hash = mutable.HashMap[String, Int]()

  string.toLowerCase().split(" ") foreach { key =>

    if (hash.getOrElse((key), null) == null) {
      hash += (key -> 1)
    } else {
      hash.update(key, hash(key) + 1) // element is in hash
    }

  }

  println("--- Duplicates ---")
  hash.filter(_._2 > 1).foreach { row =>
    println(row._1 + " " + row._2)
  }
}

