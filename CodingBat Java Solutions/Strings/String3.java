/*
* Grant Rincon
*
* Original solutions for the String-3 exercises on CodingBat.com.
* Each solution has a preceding comment that contains the exercise.
* Only the function declarations and parameters were predefined.
*/

public class String3 {

  /*
  * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in
  * "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
  * We'll say that a y or z is at the end of a word if there is not an alphabetic letter
  * immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter).
  */

  public int countYZ(String str) {
  int i;
  int count = 0;
  str = str.toLowerCase();

    for (i = 0; i < str.length(); i++) {
      if (i < str.length() - 1 && str.charAt(i) == 'z' && !Character.isLetter(str.charAt(i + 1))) {
        count++;
      }

      if (i < str.length() - 1 && str.charAt(i) == 'y' && !Character.isLetter(str.charAt(i + 1))) {
        count++;
      }

      if (i == str.length() - 1 && str.charAt(i) == 'z') {
        count++;
      }

      if (i == str.length() - 1 && str.charAt(i) == 'y') {
        count++;
      }
    }
    return count;
  }

  /*
  * Given two strings, base and remove, return a version of the base string where all instances of the
  * remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
  * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
  */

  public String withoutString(String base, String remove) {
    int i;
    String result = "";
    int end = base.length() - remove.length() + 1;
    String baseLow = base.toLowerCase();
    String removeLow = remove.toLowerCase();

    for (i = 0; i < base.length(); i++) {
      if (i < end && baseLow.substring(i, i + remove.length()).equals(removeLow)) {
        i += remove.length() - 1;
      }
      else {
      result += base.charAt(i);
      }
    }
    return result;
  }

  /*
  * Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances
  * of "not" anywhere in the string (case sensitive).
  */

  public boolean equalIsNot(String str) {
    int i;
    int isCount = 0;
    int notCount = 0;

    if (str.length() < 2) {
      return true;
    }

    for (i = 0; i < str.length() - 1; i++) {
      if (str.substring(i, i + 2).equals("is")) {
        isCount++;
      }
    }

      for (i = 0; i < str.length() - 2; i++) {
      if (str.substring(i, i + 3).equals("not")) {
        notCount++;
      }
      }
      if (isCount == notCount) {
      return true;
        }
    return false;
  }

  /*
  * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
  * Return true if all the g's in the given string are happy.
  */

  public boolean gHappy(String str) {
    int i;


    if (str.length() < 2 && str.equals("g")) {
      return false;
    }

    for (i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'g') {
        if (i == 0) {
          if (str.charAt(i + 1) != 'g') {
            return false;
          }

          if (str.length() < 3 && str.charAt(i + 1) == 'g') {
            return true;
          }
        }
        if (i == str.length() - 1) {
          if (str.charAt(i - 1) != 'g') {
            return false;
          }
        }
        if (str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {
          return false;
        }
        }
      }
      return true;
  }

  /*
  * We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string.
  * The triples may overlap.
  */

  public int countTriple(String str) {
    int i;
    int count = 0;

    for (i = 0; i < str.length(); i++) {
      if (i < str.length() - 2) {
        if (str.charAt(i) == str.charAt(i + 1)) {
          if (str.charAt(i) == str.charAt(i + 2)) {
            count++;
          }
        }
      }
    }
    return count;
  }

  /*
  * Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
  * Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
  * Integer.parseInt(string) converts a string to an int.)
  */

  public int sumDigits(String str) {
    int i;
    int total = 0;

    if (str.length() < 1) {
      return total;
    }

    for (i = 0; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i))) {
        break;
      }
      if (i == str.length() - 1) {
        return 0;
      }
    }

    for (i = 0; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i))) {
        total += Integer.parseInt(str.substring(i, i + 1));
      }
    }
    return total;
  }

  /*
  * Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
  * For example, sameEnds("abXab") is "ab".
  */

  public String sameEnds(String str) {
    int i;
    int z;
    String startStr = "";
    String endStr = "";
    String result = "";

    if (str.length() < 2) {
      return "";
    }

    for (i = 0; i < str.length() / 2; i++) {
      for (z = str.length() - 1; z >= str.length() / 2; z--) {
        startStr = str.substring(0, i + 1);
        endStr = str.substring(z);
        if (startStr.equals(endStr)) {
          result = startStr;
        }
      }
    }
    return result;
  }

  /*
  * Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
  * In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order
  * (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
  */

  public String reverseStr(String userStr) {
    int w;
    String res = "";

    if (userStr.length() < 1) {
      return res;
    }

    for (w = userStr.length() - 1; w >= 0; w--) {
      res += userStr.substring(w, w + 1);
    }
    return res;
  }

  public String mirrorEnds(String str) {
    int i;
    int z;
    String startStr = "";
    String endStr = "";
    String result = "";

    if (str.length() < 2) {
      result = str;
      return result;
    }

    for (i = 1; i <= str.length(); i++) {
      for (z = str.length() - 1; z >= 0; z--) {
        startStr = str.substring(0, i);
        endStr = reverseStr(str.substring(z));

        if (startStr.equals(endStr)) {
          result = startStr;
        }
      }
    }
    return result;
  }

  /*
  * Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
  */

  public int maxBlock(String str) {
    int length = str.length();
    int temp = 1;
    int count = 0;

    for (int i = 0; i < length; i++) {
      if (i < length - 1 && str.charAt(i) == str.charAt(i + 1)) {
        temp++;
      }
      else {
        temp = 1;
      }
      if (count < temp) {
        count = temp;
      }
    }
    return count;
  }

  /*
  * Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
  * A number is a series of 1 or more digit chars in a row.
  * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
  * Integer.parseInt(string) converts a string to an int.)
  */

  public int sumNumbers(String str) {
    int i;
    int z;
    int count = 0;
    String num = "";

    for (i = 0; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i))) {
        num += str.charAt(i);
        if (i == str.length() - 1 && !num.equals("")) {
            count += Integer.parseInt(num);
          }
        }
      else if (!Character.isDigit(str.charAt(i)) && !num.equals("")) {
        count += Integer.parseInt(num);
        num = "";
        }
    }
    return count;
  }

  /*
  * Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
  * The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.
  * (Note: Character.isLetter(char) tests if a char is a letter.)
  */

  public String notReplace(String str) {
    int i;
    String result = "";
    str = "*" + str + "*";

    for (i = 1; i < str.length() - 1; i++) {
      if (str.substring(i, i + 2).equals("is") && !Character.isLetter(str.charAt(i - 1)) && !Character.isLetter(str.charAt(i + 2))) {
        result += "is not";
        i++;
      }
      else {
        result += str.substring(i, i + 1);
      }
    }
    return result;
  }

}
