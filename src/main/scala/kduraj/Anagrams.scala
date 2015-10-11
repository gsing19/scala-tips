package kduraj

/**
 * Anagram for words bigger than 4 chars
 */
object Anagrams {

  val words = List("kitchen", "thicken", "the", "ababab", "testing", "bababa")
  val result = words.filter(_.length > 4).groupBy(_.sorted).values
  result.foreach(println)
}
