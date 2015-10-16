package kduraj

/**
 * Created by kevin1 on 10/16/15.
 */
object Palindrome {

  def apply(str: String): Unit = {
    if(isPalindrome(str)) {
      println(str + ": is OK Palindrome")
    } else {
      println(str + ": is NOT Palindrome")
    }
  }

  def isPalindrome(str: String): Boolean = {
    (str.size >= 2) && str == str.reverse
  }
  
}
