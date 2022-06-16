/*
* Grant Rincon
*
* Original solutions for the String-2 exercises on CodingBat.com.
* Each solution has a preceding comment that contains the exercise.
* Only the function declarations and parameters were predefined.
*/

public class String2 {

  // Given a string, return a string where for every char in the original, there are two chars.

  public String doubleChar(String str) {
  int i;
  String result = "";

  for (i = 0; i < str.length(); i++) {
    result += str.substring(i, i + 1);
    result += str.substring(i, i + 1);
  }
  return result;
}

  // Return the number of times that the string "hi" appears anywhere in the given string.

  public int countHi(String str) {
  int count = 0;
  int i;

  for (i = 0; i < str.length() - 1; i++) {
    if (str.substring(i, i +2).equals("hi")) {
      count++;
    }
  }
  return count;
}

 // Return true if the string "cat" and "dog" appear the same number of times in the given string.

 public boolean catDog(String str) {
  int catCount = 0;
  int dogCount = 0;
  int i;

  for (i = 0; i < str.length() - 2; i++) {
    if (str.substring(i, i + 3).equals("cat")) {
      catCount++;
    }
    if (str.substring(i, i + 3).equals("dog")) {
      dogCount++;
    }
  }
  if (catCount == dogCount) {
    return true;
  }
  return false;
}

  /*
  * Return the number of times that the string "code" appears anywhere in the given string,
  * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
  */

  public int countCode(String str) {
  int count = 0;
  int i;

  for (i = 0; i < str.length() - 3; i++) {
    if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
      count++;
    }
  }
  return count;
}

  /*
  * Given two strings, return true if either of the strings appears at the very end of the other string,
  * ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
  * Note: str.toLowerCase() returns the lowercase version of a string.
  */

  public boolean endOther(String a, String b) {
  String aLow = a.toLowerCase();
  String bLow = b.toLowerCase();
  String aEnd = aLow;
  String bEnd = bLow;

  if (aLow.length() >= bLow.length()) {
    aEnd = aLow.substring(aLow.length() - bLow.length());
  }
  if (bLow.length() >= aLow.length()) {
    bEnd = bLow.substring(bLow.length() - aLow.length());
  }

  if (bEnd.equals(aLow) || aEnd.equals(bLow)) {
    return true;
  }
  return false;
}

  /*
  * Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by
  * a period (.). So "xxyz" counts but "x.xyz" does not.
  */

  public boolean xyzThere(String str) {
  int i;

  for (i = 0; i < str.length() - 2; i++) {
    if (i == 0) {
      if (str.substring(i, i + 3).equals("xyz")) {
        return true;
      }
    }
    else {
      if (str.substring(i, i + 3).equals("xyz") && str.charAt(i - 1) != '.') {
        return true;
      }
    }
  }
  return false;
}

  // Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

  public boolean bobThere(String str) {
  int i;

  for (i = 0; i < str.length() - 2; i++) {
    if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
      return true;
    }
  }
  return false;
}

  /*
  * We'll say that a String is xy-balanced if for all the 'x' chars in the string,
  * there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
  * One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
  */

  public boolean xyBalance(String str) {

  return (str.indexOf('x')==-1) ||
str.lastIndexOf('x') < str.lastIndexOf('y');

}

  /*
  * Given two strings, a and b, create a bigger string made of the first char of a,
  * the first char of b, the second char of a, the second char of b, and so on.
  * Any leftover chars go at the end of the result.
  */

  public String mixString(String a, String b) {
  int i;
  int end = a.length();
  String result = "";

  if (end > b.length()) {
    end = b.length();
  }

  for (i = 0; i < end; i++) {
    result += a.substring(i, i + 1) + b.substring(i, i + 1);
  }

  if (end < a.length()) {
    result += a.substring(end);
  }

  if (end < b.length()) {
    result += b.substring(end);
  }
  return result;
}

  /*
  * Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
  * You may assume that n is between 0 and the length of the string, inclusive.
  */

  public String repeatEnd(String str, int n) {
  int i;
  String result = "";

  for (i = n - 1; i >= 0; i--) {
    result += str.substring(str.length() - n);
  }
  return result;
}

  /*
  * Given a string and an int n, return a string made of the first n characters of the string,
  * followed by the first n-1 characters of the string, and so on. You may assume that n is
  * between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
  */

  public String repeatFront(String str, int n) {
  int i;
  String result = "";

  for (i = n; i >= 0; i--) {
    result += str.substring(0, i);
  }

  return result;
}

  /*
  * Given two strings, word and a separator sep,
  * return a big string made of count occurrences of the word, separated by the separator string.
  */

  public String repeatSeparator(String word, String sep, int count) {
  int i;
  String result = "";

  for (i = 0; i < count; i++) {
    if (i == count - 1) {
      result += word;
      break;
    }
    else {
      result += word + sep;
    }
  }
  return result;
}

  /*
  * Given a string, consider the prefix string made of the first N chars of the string.
  * Does that prefix string appear somewhere else in the string?
  * Assume that the string is not empty and that N is in the range 1..str.length().
  */

  public boolean prefixAgain(String str, int n) {
  int i;
  String prefix = str.substring(0, n);

  if (str.length() <= 1) {
    return false;
  }

  for (i = n; i < str.length() - n + 1; i++) {
    if (str.substring(i, i + n).equals(prefix)) {
      return true;
    }
  }
  return false;
}

  /*
  * Given a string, does "xyz" appear in the middle of the string? To define middle,
  * we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
  * This problem is harder than it looks.
  */

  public boolean xyzMiddle(String str) {
    int xyzS = 0;
    int xyzE = 0;

    if (str.length() < 3 || !str.contains("xyz")) {
      return false;
    }


    for (int i = 0; i < str.length() - 2; i++) {
      if (str.substring(i, i + 3).equals("xyz")) {
        xyzS = i;
        xyzE = i + 2;
        int strS = str.substring(0, xyzS).length();
        int strE = str.substring(xyzE + 1).length();

        if (Math.abs(strS - strE) <= 1) {
          return true;
          }
      }
      else {
        continue;
      }
    }

    return false;
  }

  /*
  * A sandwich is two pieces of bread with something in between.
  * Return the string that is between the first and last appearance of "bread" in the given string,
  * or return the empty string "" if there are not two pieces of bread.
  */

  public String getSandwich(String str) {
    if (str.indexOf("bread") == str.lastIndexOf("bread")) {
      return "";
    }

    return (str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread")));
  }

  /*
  * Returns true if for every '*' (star) in the string,
  * if there are chars both immediately before and after the star, they are the same.
  */

  public boolean sameStarChar(String str) {
    int i;

    for (i = 1; i < str.length() - 1; i++) {
      if (str.charAt(i) == '*') {
        if (str.charAt(i - 1) != str.charAt(i + 1)) {
          return false;
        }
      }
    }
    return true;
  }

  /*
  * Given a string, compute a new string by moving the first char to come after the next two chars,
  * so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd".
  * Ignore any group of fewer than 3 chars at the end.
  */

  public String oneTwo(String str) {
    int i;
    String result = "";

    for (i = 0; i < str.length() - 2; i += 3) {
      result += str.substring(i + 1, i + 3);
      result += str.charAt(i);
    }
    return result;
  }

  /*
  * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
  * Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
  */

  public String zipZap(String str) {
  int i;
  String result = "";


    if (str.length() < 3) {
      return str;
    }

    for (i = 0; i <= str.length() - 3; i++) {
      if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
        result += str.substring(i, i +1) + str.substring(i +2, i + 3);
        i += 2;
      }
      else {
        result += str.substring(i, i + 1);
        if (i == str.length() - 3) {
          result += str.substring(str.length() - 2);
        }
      }
    }

    return result;
  }

  /*
  * Return a version of the given string, where for every star (*) in the string the star and
  * the chars immediately to its left and right are gone.
  * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
  */

  public String starOut(String str) {
  int i;
  String result = "";

    for (i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '*') {
        continue;
      }

      if (i > 0 && str.charAt(i - 1) == '*') {
        continue;
      }

      if (i > 0 && str.charAt(i - 1) == '*') {
        continue;
      }

      if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
        continue;
      }
      result += str.substring(i, i +1);
    }
    return result;
  }

  /*
  * Given a string and a non-empty word string, return a version of the original String where all
  * chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved
  * unchanged.
  */

  public String plusOut(String str, String word) {
  int i;
  String result = "";

  for (i = 0; i < str.length(); i++) {
    if (i <= str.length() - word.length() && word.equals(str.substring(i, i + word.length()))) {
      result += str.substring(i, i + word.length());
      i += word.length() - 1;
    }
    else {
      result += '+';
    }
  }
  return result;
  }

  /*
  * Given a string and a non-empty word string, return a string made of each char just before and
  * just after every appearance of the word in the string.
  * Ignore cases where there is no char before or after the word, and a char may be included twice
  * if it is between two words.
  */

  public String wordEnds(String str, String word) {
  int i;
  String result = "";
  int end = str.length() - word.length() + 1;

  for (i = 0; i < end; i++) {
    String temp = str.substring(i, i + word.length());

    if (i > 0 && temp.equals(word)) {
      result += str.substring(i - 1, i);
    }

    if (i < end - 1 && temp.equals(word)) {
      result += str.substring(i + word.length(), i + word.length() + 1);
    }
  }
  return result;
  }
}
