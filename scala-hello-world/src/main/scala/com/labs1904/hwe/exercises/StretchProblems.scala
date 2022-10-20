package com.labs1904.hwe.exercises

object StretchProblems {

  /*
  Checks if a string is palindrome.
 */

  def isPalindrome(s: String): Boolean = {
    //    s.toList == s.toList.reverse
    s == s.reverse
  }
  /*
For a given number, return the next largest number that can be created by rearranging that number's digits.
If no larger number can be created, return -1
 */
  def getNextBiggestNumber(inputInt: Integer): Int = {
    //TODO: Implement me!
    val reversedInputToString: String = inputInt.toString
    val perString: List[String] = reversedInputToString.permutations.toList.sorted
    //    val perString = reversedInputToString.permutations.sorted
    val indexOfInputInt: Int = perString.indexOf(reversedInputToString)
    val isInputIntTheMax: Boolean = {
      indexOfInputInt == perString.length - 1
    }
    isInputIntTheMax match {
      case true => -1
      case false => perString(indexOfInputInt + 1).toInt
    }
  }

}
