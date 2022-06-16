/*
* Grant Rincon
*
* Original solutions for the Array-3 exercises on CodingBat.com.
* Each solution has a preceding comment that contains the exercise.
* Only the function declarations and parameters were predefined.
*/

public class Array3 {

  /*
  * Consider the leftmost and righmost appearances of some value in an array.
  * We'll say that the "span" is the number of elements between the two inclusive.
  * A single value has a span of 1. Returns the largest span found in the given array.
  * (Efficiency is not a priority).
  */

  public int maxSpan(int[] nums) {
    int i;
    int j;
    int temp;
    int count = 1;
    int tempCount = 1;
    boolean spanFound = false;

    if (nums.length < 1) {
      return 0;
    }
    for (i = 0; i < nums.length; i++) {
      if (i < nums.length - 1) {
        tempCount = 1;
        for (j = i + 1; j < nums.length; j++) {
          if (nums[j] == nums[i]) {
            spanFound = true;
            if ((j - i) > tempCount) {
              tempCount = j - i;
            }
          }
        }
        if (spanFound) {
        tempCount++;
        }
        if (tempCount > count) {
          count = tempCount;
          tempCount = 1;
        }
      }
    }
    return count;
  }

  /*
  * Return an array that contains exactly the same numbers as the given array,
  * but rearranged so that every 3 is immediately followed by a 4.
  * Do not move the 3's, but every other number may move. The array contains
  * the same number of 3's and 4's, every 3 has a number after it that is not
  * a 3, and a 3 appears in the array before any 4.
  */

  public int[] fix34(int[] nums) {
    int i;
    int j;
    int[] res = new int[nums.length];

    if (nums.length < 2) {
      return nums;
    }

    for (i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 3) {
        res[i] = 3;
        res[i + 1] = 4;
      }
    }
    for (i = 0, j = 0; i < nums.length; i++) {
      if (res[j] == 3) {
        j += 2;
        if (j > nums.length - 1) {
          break;
        }
      }
      if (nums[i] == 3 || nums[i] == 4) {
        continue;
      }
      else {
        res[j++] = nums[i];
        if (j > nums.length - 1) {
          break;
        }
      }
    }
    return res;
  }

  /*
  * Return an array that contains exactly the same numbers as the given array,
  * but rearranged so that every 4 is immediately followed by a 5.
  * Do not move the 4's, but every other number may move. The array contains
  * the same number of 4's and 5's, and every 4 has a number after it that is
  * not a 4. In this version, 5's may appear anywhere in the original array.
  */

  public int[] fix45(int[] nums) {
    int i;
    int j;
    int[] res = new int[nums.length];

    if (nums.length < 2) {
      return nums;
    }

    for (i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 4) {
        res[i] = 4;
        res[i + 1] = 5;
      }
    }
    for (i = 0, j = 0; i < nums.length; i++) {
      if (res[j] == 4) {
        j += 2;
        if (j > nums.length - 1) {
          break;
        }
      }
      if (nums[i] == 4 || nums[i] == 5) {
        continue;
      }
      else {
        res[j++] = nums[i];
        if (j > nums.length - 1) {
          break;
        }
      }
    }
    return res;
  }

  /*
  * Given a non-empty array, return true if there is a place to split the array
  * so that the sum of the numbers on one side is equal to the sum of the
  * numbers on the other side.
  */

  public boolean canBalance(int[] nums) {
    int i;
    int j;
    int leftSum = 0;
    int rightSum = 0;

    for (i = 0; i < nums.length - 1; i++) {
      leftSum += nums[i];
      for (j = i + 1; j < nums.length; j++) {
        rightSum += nums[j];
      }
      if (leftSum == rightSum) {
          return true;
        }
      else {
        rightSum = 0;
      }
    }
    return false;
  }

  /*
  * Given two arrays of ints sorted in increasing order, outer and inner,
  * return true if all of the numbers in inner appear in outer.
  * The best solution makes only a single "linear" pass of both arrays,
  * taking advantage of the fact that both arrays are already in sorted order.
  */

  public boolean linearIn(int[] outer, int[] inner) {
    int i;
    int j;
    int count = 0;

    if (inner.length < 1) {
      return true;
    }

    for (i = 0; i < inner.length; i++) {
      for (j = 0; j < outer.length; j++) {
        if (inner[i] == outer[j]) {
          count++;
          if (i < inner.length - 1) {
            i++;
          }
          if (count == inner.length) {
          return true;
          }
        }
      }
    }
    return false;
  }

  /*
  * Given n>=0, create an array length n*n with the following pattern,
  * shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1}
  * (spaces added to show the 3 groups).
  */

  public int[] squareUp(int n) {
    int len = n * n;
    int[] res = new int[len];
    int i;
    int j;
    int limit = n;
    int point;

    for (i = res.length - 1; i >= 0; i -= n) {
      point = i;
      for (j = 1; j <= limit; j++) {
         res[point--] = j;
      }
      if (limit > 0) {
        limit--;
      }
    }
    return res;
  }

  /*
  * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,
  *  ... 1, 2, 3 .. n} (spaces added to show the grouping).
  * Note that the length of the array will be 1 + 2 + 3 ... + n, which is known
  *  to sum to exactly n*(n + 1)/2.
  */

  public int[] seriesUp(int n) {
    int len = n * (n + 1) / 2;
    int[] res = new int[len];
    int i;
    int j;

    for (i = 0; i < n; i++) {
      for (j = 0; j < i + 1; j++) {
        res[(i*(i + 1)/2) + j] = j + 1;
      }
    }
    return res;
  }

  /*
  * We'll say that a "mirror" section in an array is a group of contiguous
  * elements such that somewhere in the array, the same group appears in
  * reverse order. For example, the largest mirror section in
  * {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
  * Return the size of the largest mirror section found in the given array.
  */

  public int maxMirror(int[] nums) {
    int i;
    int j;
    int res = 0;
    int tempRes = 0;

    for (i = 0; i < nums.length; i++) {
      for (j = nums.length - 1; j >= 0 && i + tempRes < nums.length; j--) {
        if (nums[i + tempRes] == nums[j]) {
          tempRes++;
        }
        else {
          if (tempRes > res) {
        res = tempRes;
      }
      tempRes = 0;
        }
      }
       res = Math.max(res, tempRes);
    }
    return res;
  }

  /*
  * Say that a "clump" in an array is a series of 2 or more adjacent
  * elements of the same value. Return the number of clumps in the given array.
  */

  public int countClumps(int[] nums) {
    int i;
    int j;
    int count = 0;
    int length = nums.length;
    int temp;

    if (length < 2) {
      return 0;
    }

    for (i = 0; i < length - 1; i++) {
      temp = nums[i];

      if (nums[i + 1] == temp) {
        count++;
        for (j = i + 1; j < length; j++) {
          if (nums[j] != temp) {
            i += j - i - 1;
            break;
          }
          if (j == length - 1) {
            return count;
          }
        }
      }
    }
    return count;
  }
}
