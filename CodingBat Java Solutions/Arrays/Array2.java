/*
* Grant Rincon
*
* Original solutions for the Array-2 exercises on CodingBat.com.
* Each solution has a preceding comment that contains the exercise.
* Only the function declarations and parameters were predefined.
*/

public class Array2 {

  /*
  * Return the number of even ints in the given array.
  * Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
  */

  public int countEvens(int[] nums) {
    int count = 0;
    int i;

    for (i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        count++;
      }
    }
    return count;
  }
  /*
  * Given an array length 1 or more of ints, return the difference between the largest and
  * smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2)
  * methods return the smaller or larger of two values.
  */

  public int bigDiff(int[] nums) {
    int result;
    int max;
    int min;

    if (nums.length < 2) {
      return 0;
    }

    max = nums[0];
    min = nums[1];

    if (min > max) {
      int temp = max;
      max = min;
      min = temp;
    }

    for (int i = 0; i < nums.length; i++) {
      max = Math.max(max, nums[i]);
      min = Math.min(min, nums[i]);
    }
    return max - min;
  }

  /*
  * Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
  * except ignoring the largest and smallest values in the array.
  * If there are multiple copies of the smallest value, ignore just one copy,
  * and likewise for the largest value. Use int division to produce the final average.
  * You may assume that the array is length 3 or more.
  */

  public int centeredAverage(int[] nums) {
    int result;
    int total = 0;
    int i;
    int min = nums[0];
    int max = nums[1];
    int temp;

    if (min > max) {
      temp = max;
      max = min;
      min = temp;
    }

    for (i = 0; i < nums.length; i++) {
      total += nums[i];
      if (nums[i] > max) {
        max = nums[i];
      }
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    total -= max + min;
    result = total / (nums.length - 2);
    return result;
  }

  /*
  * Return the sum of the numbers in the array, returning 0 for an empty array.
  * Except the number 13 is very unlucky, so it does not count and numbers that come
  * immediately after a 13 also do not count.
  */

  public int sum13(int[] nums) {
    int i;
    int total = 0;

    if (nums.length < 1) {
      return 0;
    }

    for (i = 0; i < nums.length; i++) {
      if (nums[i] == 13) {
        i++;
      }
      else {
        total += nums[i];
      }
    }
    return total;
  }

  /*
  * Return the sum of the numbers in the array, except ignore sections of numbers
  * starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
  * Return 0 for no numbers.
  */

  public int sum67(int[] nums) {
    int i;
    int total = 0;

    if (nums.length < 1) {
      return 0;
    }

    for (i = 0; i < nums.length; i++) {
      if (nums[i] == 6) {
        i++;
        while (nums[i] != 7) {
          i++;
        }
      }
        else {
          total += nums[i];
        }
      }
    return total;
  }

  // Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

  public boolean has22(int[] nums) {
    int i;

    if (nums.length < 2) {
      return false;
    }

    for (i = 0; i < nums.length; i++) {
      if (i < nums.length - 1 && nums[i] == 2 && nums[i + 1] == 2) {
        return true;
      }
    }
    return false;
  }

  // Given an array of ints, return true if the array contains no 1's and no 3's.

  public boolean lucky13(int[] nums) {
    int i;

    for (i = 0; i < nums.length; i++) {
      if (nums[i] == 1 || nums[i] == 3) {
        return false;
      }
    }
    return true;
  }

  // Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

  public boolean sum28(int[] nums) {
    int total = 0;
    int i;

    if (nums.length < 4) {
      return false;
    }

    for (i = 0; i < nums.length; i++) {
      if (nums[i] == 2) {
        total += 2;
      }
    }
    if (total == 8) {
      return true;
    }
    return false;
  }

  // Given an array of ints, return true if the number of 1's is greater than the number of 4's

  public boolean more14(int[] nums) {
    int i;
    int oneCount = 0;
    int fourCount = 0;

    if (nums.length < 1) {
      return false;
    }

    for (i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        oneCount++;
      }
      if (nums[i] == 4) {
        fourCount++;
      }
    }
    if (oneCount > fourCount) {
      return true;
    }
    return false;
  }

  /*
  * Given a number n, create and return a new int array of length n,
  * containing the numbers 0, 1, 2, ... n-1. The given n may be 0,
  * in which case just return a length 0 array.
  */

  public int[] fizzArray(int n) {
    int[] resArray = new int[n];
    int num = 0;
    int i;

    for (i = 0; i < n; i++) {
      resArray[i] = num;
      num++;
    }
    return resArray;
  }

  // Given an array of ints, return true if every element is a 1 or a 4.

  public boolean only14(int[] nums) {
    int i;

    for (i = 0; i < nums.length; i++) {
      if (nums[i] == 4 || nums[i] == 1) {
        continue;
      }
      else {
        return false;
      }
    }
    return true;
  }

  /*
  * Given a number n, create and return a new string array of length n,
  * containing the strings "0", "1" "2" .. through n-1.
  * N may be 0, in which case just return a length 0 array.
  */

  public String[] fizzArray2(int n) {
    String[] resArr = new String[n];
    int num = 0;
    int i;

    for (i = 0; i < n; i++) {
      resArr[i] = String.valueOf(num);
      num++;
    }
    return resArr;
  }

  // Given an array of ints, return true if it contains no 1's or it contains no 4's.

  public boolean no14(int[] nums) {
    int i;
    int fourCount = 0;
    int oneCount = 0;

    for (i = 0; i < nums.length; i++) {
      if (nums[i] == 4) {
        fourCount++;
      }
      if (nums[i] == 1) {
        oneCount++;
      }
    }
    if (fourCount == 0 || oneCount == 0) {
      return true;
    }
    return false;
  }

  /*
  * We'll say that a value is "everywhere" in an array if for every pair of
  * adjacent elements in the array, at least one of the pair is that value.
  * Return true if the given value is everywhere in the array.
  */

  public boolean isEverywhere(int[] nums, int val) {
    int i;

    for (i = 0; i < nums.length - 1; i++) {
      if (nums[i] == val) {
        continue;
      }
      else {
        if (nums[i + 1] != val) {
          return false;
        }
      }
    }
    return true;
  }

  /*
  * Given an array of ints, return true if the array contains
  * a 2 next to a 2 or a 4 next to a 4, but not both.
  */

  public boolean either24(int[] nums) {
    int i;
    boolean twoPair = false;
    boolean fourPair = false;

    for (i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 2 && nums[i + 1] == 2) {
        i++;
        twoPair = true;
      }
      if (nums[i] == 4 && nums[i + 1] == 4) {
        i++;
        fourPair = true;
      }
    }
    if (fourPair && twoPair || !fourPair && !twoPair) {
      return false;
    }
    return true;
  }

  /*
  * Given arrays nums1 and nums2 of the same length, for every element in nums1,
  * consider the corresponding element in nums2 (at the same index).
  * Return the count of the number of times that the two elements differ by 2 or less,
  * but are not equal.
  */

  public int matchUp(int[] nums1, int[] nums2) {
    int count = 0;
    int i;
    int len = nums1.length;
    int num1;
    int num2;

    if (nums1.length > nums2.length) {
      len = nums2.length;
    }

    for (i = 0; i < len; i++) {
      num1 = nums1[i];
      num2 = nums2[i];
      if (Math.abs(num1 - num2) <= 2 && Math.abs(num1 - num2) != 0) {
        count++;
      }
    }
    return count;
  }

  /*
  * Given an array of ints, return true if the array contains two 7's next to each other,
  * or there are two 7's separated by one element, such as with {7, 1, 7}.
  */

  public boolean has77(int[] nums) {
    int i;

    for (i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 7) {
        if (i < nums.length - 2)
          if (nums[i + 1] == 7 || nums[i + 2] == 7) {
            return true;
          }
        if (i >= nums.length - 2) {
          if (nums[i + 1] == 7) {
            return true;
          }
        }
      }
    }
    return false;
  }

  /*
  * Given an array of ints, return true if there is a 1 in the array with a 2
  * somewhere later in the array.
  */

  public boolean has12(int[] nums) {
    int i;
    boolean oneFound = false;
    boolean twoFound = false;

    for (i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        oneFound = true;
      }
      if (nums[i] == 2 && oneFound == true) {
        twoFound = true;
      }
    }
    if (oneFound && twoFound) {
      return true;
    }
    return false;
  }

  /*
  * Given an array of ints, return true if the array contains either 3 even or
  * 3 odd values all next to each other.
  */

  public boolean modThree(int[] nums) {
    int i;

    if (nums.length < 3) {
      return false;
    }

    for (i = 0; i < nums.length - 2; i++) {
      if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0)
      || (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1)) {
        return true;
      }
    }
    return false;
  }

  /*
  * Given an array of ints, return true if the value 3 appears in the array exactly 3 times,
  * and no 3's are next to each other.
  */

  public boolean haveThree(int[] nums) {
    int i;
    int threeCount = 0;

    if (nums.length < 5) {
      return false;
    }

    for (i = 0; i < nums.length; i++) {
      if (i == 0) {
        if (nums[i] == 3 && nums[i + 1] != 3) {
          threeCount++;
          continue;
        }
      }
      if (i == nums.length - 1) {
        if (nums[i] == 3 && nums[i - 1] != 3) {
          threeCount++;
          continue;
        }
      }
      else if (nums[i] == 3) {
          if (nums[i - 1] != 3 && nums[i + 1] != 3) {
          threeCount++;
        }
      }
    }
    if (threeCount == 3) {
      return true;
    }
    return false;
  }

  // Given an array of ints, return true if every 2 that appears in the array is next to another 2.

  public boolean twoTwo(int[] nums) {
    int i;

    if (nums.length < 2) {
      if (nums.length > 0 && nums[0] == 2) {
        return false;
      }
      else {
      return true;
      }
    }

    for (i = 0; i < nums.length; i++) {
      if (nums[i] == 2) {
        if (i == 0) {
          if (nums[i + 1] != 2) {
            return false;
          }
          else {
            continue;
          }
        }
        if (i == nums.length - 1) {
          if (nums[i - 1] != 2) {
            return false;
          }
          else {
            continue;
          }
        }
        else if (nums[i - 1] != 2 && nums[i + 1] != 2) {
          return false;
        }
      }
    }
    return true;
  }

  /*
  * Return true if the group of N numbers at the start and end of the array are the same.
  * For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2,
  * and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.
  */

  public boolean sameEnds(int[] nums, int len) {
    int i;
    int j;

    for (i = 0, j = nums.length - len; i < len; i++, j++) {
      if (nums[i] != nums[j]) {
        return false;
      }
    }
    return true;
  }

  /*
  * Return true if the array contains, somewhere, three increasing adjacent numbers
  * like .... 4, 5, 6, ... or 23, 24, 25.
  */

  public boolean tripleUp(int[] nums) {
    int i;

    if (nums.length < 3) {
      return false;
    }

    for (i = 0; i < nums.length - 2; i++) {
      if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2) {
        return true;
      }
    }
    return false;
  }

  /*
  * Given start and end numbers, return a new array containing the sequence of integers
  * from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}.
  * The end number will be greater or equal to the start number.
  */

  public int[] fizzArray3(int start, int end) {
    int len = end - start;
    int[] resArr = new int[len];
    int i;
    int temp = start;

    if (len == 0) {
      return resArr;
    }

    for (i = 0; i < resArr.length; i++) {
      resArr[i] = temp;
      temp++;
    }
    return resArr;
  }

  /*
  * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
  * You may modify and return the given array, or return a new array.
  */

  public int[] shiftLeft(int[] nums) {
    int i;
    int[] resArr = new int[nums.length];

    if (nums.length < 2) {
      return nums;
    }

    for (i = 0; i < nums.length - 1; i++) {
      resArr[i] = nums[i + 1];
    }

    resArr[resArr.length - 1] = nums[0];

    return resArr;
  }

  /*
  * For each multiple of 10 in the given array, change all the values following it to be
  * that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5}
  * yields {2, 10, 10, 10, 20, 20}.
  */

  public int[] tenRun(int[] nums) {
    boolean tenFound = false;
    int i;
    int tenMult = 0;
    int[] resArr = new int[nums.length];

    for (i = 0; i < nums.length; i++) {
      if (tenFound == false) {
        if (nums[i] % 10 == 0) {
          tenFound = true;
          tenMult = nums[i];
          resArr[i] = tenMult;
        }
        else {
          resArr[i] = nums[i];
          continue;
        }
      }
      if (tenFound == true) {
        if (nums[i] % 10 == 0) {
          tenMult = nums[i];
          resArr[i] = tenMult;
        }
        else {
          resArr[i] = tenMult;
        }
      }
      }
    return resArr;
  }

  /*
  * Given a non-empty array of ints, return a new array containing the elements
  * from the original array that come before the first 4 in the original array.
  * The original array will contain at least one 4. Note that it is valid in java to
  * create an array of length 0.
  */

  public int[] pre4(int[] nums) {
    int[] res = new int[nums.length];
    int i;

    for (i = 0; i < nums.length; i++) {
      if (nums[i] == 4) {
        if (res.length == nums.length) {
          res = new int[i];
          i = 0;
        }
        else {
          return res;
        }
      }
      if (res.length == 0) {
        return res;
      }
      res[i] = nums[i];
    }
    return res;
  }

  /*
  * Given a non-empty array of ints, return a new array containing the elements
  * from the original array that come after the last 4 in the original array.
  * The original array will contain at least one 4.
  */

  public int[] post4(int[] nums) {
    int i;
    int j = 0;
    int[] res = new int[0];

    for (i = 0; i < nums.length; i++) {
      if (nums[i] == 4) {
        res = new int[nums.length - i - 1];
        j = 0;
      }
      else {
        if (res.length > 0) {
          res[j++] = nums[i];
        }
      }
    }
    return res;
  }

  /*
  * We'll say that an element in an array is "alone" if there are values before
  * and after it, and those values are different from it.
  * Return a version of the given array where every instance of the given value
  * which is alone is replaced by whichever value to its left or right is larger.
  */

  public int[] notAlone(int[] nums, int val) {
    int i;
    int[] res = new int[nums.length];

    for (i = 0; i < nums.length; i++) {
      if (nums[i] == val && i > 0 && i < nums.length - 1) {
        if (nums[i + 1] != val && nums[i - 1] != val) {
          if (nums[i - 1] > nums[i + 1]) {
            res[i] = nums[i - 1];
          }
          if (nums[i + 1] > nums[i - 1]) {
            res[i] = nums[i + 1];
          }
        }
        else {
          res[i] = nums[i];
        }
      }
      else {
        res[i] = nums[i];
      }
    }
    return res;
  }

  /*
  * Return an array that contains the exact same numbers as the given array,
  * but rearranged so that all the zeros are grouped at the start of the array.
  * The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes
  * {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
  */

  public int[] zeroFront(int[] nums) {
    int i;
    int[] res = new int[nums.length];
    boolean cycled = false;
    int j = 0;

    for (i = 0; i < nums.length; i++) {
      if (!cycled) {
        if (nums[i] == 0) {
          res[j++] = nums[i];
        }
        if (i == nums.length - 1) {
          cycled = true;
          i = 0;
        }
      }
      if (cycled) {
        if (nums[i] != 0) {
          res[j++] = nums[i];
        }
      }
    }
    return res;
  }

  /*
  * Return a version of the given array where all the 10's have been removed.
  * The remaining elements should shift left towards the start of the array as
  * needed, and the empty spaces a the end of the array should be 0.
  * So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given
  * array or make a new array.
  */

  public int[] withoutTen(int[] nums) {
    int i;
    int[] res = new int[nums.length];
    int j  = 0;

    if (nums.length < 1) {
      return res;
    }
    for (i = 0; i < nums.length; i++) {
      if (nums[i] != 10) {
        res[j++] = nums[i];
      }
    }
    return res;
  }

  /*
  * Return a version of the given array where each zero value in the array
  * is replaced by the largest odd value to the right of the zero in the array.
  * If there is no odd value to the right of the zero, leave the zero as a zero.
  */

  public int[] zeroMax(int[] nums) {
    int i;
    int[] res = new int[nums.length];
    int maxOdd = 0;

    if (nums.length < 2) {
      return nums;
    }

    for (i = nums.length - 1; i >= 0; i--) {
      if (nums[i] == 0 && i < nums.length - 1 && maxOdd != 0) {
        res[i] = maxOdd;
      }
      else {
        if (nums[i] % 2 != 0 && nums[i] > maxOdd) {
          maxOdd = nums[i];
        }
        res[i] = nums[i];
      }
    }
    return res;
  }

  /*
  * Return an array that contains the exact same numbers as the given array,
  * but rearranged so that all the even numbers come before all the odd numbers.
  * Other than that, the numbers can be in any order. You may modify and return
  * the given array, or make a new array.
  */

  public int[] evenOdd(int[] nums) {
    int i;
    int j = 0;
    int o = nums.length - 1;
    int[] res = new int[nums.length];

    for (i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        res[j++] = nums[i];
      }
      else {
        res[o--] = nums[i];
      }
    }
    return res;
  }

  /*
  * Consider the series of numbers beginning at start and running up to but not
  * including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4.
  * Return a new String[] array containing the string form of these numbers,
  * except for multiples of 3, use "Fizz" instead of the number, for multiples
  * of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
  */

  public String[] fizzBuzz(int start, int end) {
    int len = end - start;
    String[] res = new String[len];
    String num = "";
    int i;
    int j = 0;

    for (i = start; i < end; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        num = "FizzBuzz";
      }
      else if (i % 3 == 0) {
        num = "Fizz";
      }
      else if (i % 5 == 0) {
        num = "Buzz";
      }
      else {
        num = String.valueOf(i);
      }
      res[j++] = num;
    }
    return res;
  }
}
