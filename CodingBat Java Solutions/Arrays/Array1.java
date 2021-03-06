/*
* Grant Rincon
*
* Original solutions for the Array-1 exercises on CodingBat.com.
* Each solution has a preceding comment that contains the exercise.
* Only the function declarations and parameters were predefined.
*/

public class Array1 {

  /*
  * Given an array of ints, return true if 6 appears as either the first or last element in the array.
  * The array will be length 1 or more.
  */

  public boolean firstLast6(int[] nums) {
    if (nums[0] == 6 || nums[nums.length - 1] == 6) {
      return true;
    }
    return false;
  }

  /*
  * Given an array of ints, return true if the array is length 1 or more,
  * and the first element and the last element are equal.
  */

  public boolean sameFirstLast(int[] nums) {
    if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
      return true;
    }
    return false;
  }

  // Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

  public int[] makePi() {
    int[] pi = {3, 1, 4};
    return pi;
  }

  /*
  * Given 2 arrays of ints, a and b, return true if they have the same first element or
  * they have the same last element. Both arrays will be length 1 or more.
  */

  public boolean commonEnd(int[] a, int[] b) {
    if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
      return true;
    }
    return false;
  }

  // Given an array of ints length 3, return the sum of all the elements.

  public int sum3(int[] nums) {
    int sum = nums[0] + nums[1] + nums[2];
    return sum;
  }

  /*
  * Given an array of ints length 3, return an array with the elements "rotated left"
  * so {1, 2, 3} yields {2, 3, 1}.
  */

  public int[] rotateLeft3(int[] nums) {
    int[] arr = new int[3];

    arr[0] = nums[1];
    arr[1] = nums[2];
    arr[2] = nums[0];

    return arr;
  }

  /*
  * Given an array of ints length 3, return a new array with the elements in reverse order,
  * so {1, 2, 3} becomes {3, 2, 1}.
  */

  public int[] reverse3(int[] nums) {
    int[] arr = new int[3];

    arr[0] = nums[2];
    arr[1] = nums[1];
    arr[2] = nums[0];

    return arr;
  }

  /*
  * Given an array of ints length 3, figure out which is larger,
  * the first or last element in the array, and set all the other elements to be that value.
  * Return the changed array.
  */

  public int[] maxEnd3(int[] nums) {
    int[] newArr = new int[3];
    int bigNum = nums[0];

    if (nums[nums.length -1] > bigNum) {
      bigNum = nums[nums.length -1];
    }

    newArr[0] = bigNum;
    newArr[1] = bigNum;
    newArr[2] = bigNum;

    return newArr;
  }

  /*
  * Given an array of ints, return the sum of the first 2 elements in the array.
  * If the array length is less than 2, just sum up the elements that exist,
  * returning 0 if the array is length 0.
  */

  public int sum2(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    if (nums.length == 1) {
      return nums[0];
    }

    return nums[0] + nums[1];
  }

  /*
  * Given 2 int arrays, a and b, each length 3,
  * return a new array length 2 containing their middle elements.
  */

  public int[] middleWay(int[] a, int[] b) {
    int[] newArr = new int[2];

    newArr[0] = a[1];
    newArr[1] = b[1];

    return newArr;
  }

  /*
  * Given an array of ints, return a new array length 2 containing
  * the first and last elements from the original array.
  * The original array will be length 1 or more.
  */

  public int[] makeEnds(int[] nums) {
    int[] myArr = new int[2];

    myArr[0] = nums[0];

    if (nums.length > 1) {
      myArr[1] = nums[nums.length - 1];
      return myArr;
    }
    myArr[1] = nums[0];

    return myArr;
  }

  /*
  * Given an int array length 2, return true if it contains a 2 or a 3.
  */

  public boolean has23(int[] nums) {
    if (nums[0] == 2 || nums[0] == 3) {
      return true;
    }

    if (nums[1] == 2 || nums[1] == 3) {
      return true;
    }

    return false;
  }

  // Given an int array length 2, return true if it does not contain a 2 or 3.

  public boolean no23(int[] nums) {
    if (nums[0] == 2 || nums[0] == 3) {
      return false;
    }

    if (nums[1] == 2 || nums[1] == 3) {
      return false;
    }

    return true;
  }

  /*
  * Given an int array, return a new array with double the length where its last element
  * is the same as the original array, and all the other elements are 0.
  * The original array will be length 1 or more. Note: by default,
  * a new int array contains all 0's.
  */

  public int[] makeLast(int[] nums) {
    int[] myArr = new int[nums.length * 2];

    myArr[myArr.length - 1] = nums[nums.length -1];

    return myArr;
  }

  /*
  * Given an int array, return true if the array contains 2 twice, or 3 twice.
  * The array will be length 0, 1, or 2.
  */

  public boolean double23(int[] nums) {
    if (nums.length < 2) {
      return false;
    }

    if (nums[0] == 2 && nums[1] == 2) {
      return true;
    }

    if (nums[0] == 3 && nums[1] == 3) {
      return true;
    }

    return false;
  }

  /*
  * Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
  * set the 3 element to 0. Return the changed array.
  */

  public int[] fix23(int[] nums) {
    int[] myArr = new int[3];
    myArr[0] = nums[0];
    if (nums[0] == 2 && nums[1] == 3) {
      myArr[1] = 0;
    }
    else {
      myArr[1] = nums[1];
    }
    if (nums[1] == 2 && nums[2] == 3) {
      myArr[2] = 0;
    }
    else {
      myArr[2] = nums[2];
    }

    return myArr;

  }

  /*
  * Start with 2 int arrays, a and b, of any length.
  * Return how many of the arrays have 1 as their first element.
  */

  public int start1(int[] a, int[] b) {
    int count = 0;
    if (a.length > 0 && a[0] == 1) {
      count++;
    }

    if (b.length > 0 && b[0] == 1) {
      count++;
    }
    return count;
  }

  /*
  * Start with 2 int arrays, a and b, each length 2.
  * Consider the sum of the values in each array.
  * Return the array which has the largest sum. In event of a tie, return a.
  */

  public int[] biggerTwo(int[] a, int[] b) {

    if (b[0] + b[1] > a[0] + a[1]) {
      return b;
    }

    return a;
  }

  /*
  * Given an array of ints of even length, return a new array length 2
  * containing the middle two elements from the original array.
  * The original array will be length 2 or more.
  */

  public int[] makeMiddle(int[] nums) {
    int[] myArr = new int[2];

    myArr[0] = nums[(nums.length / 2) - 1];
    myArr[1] = nums[(nums.length / 2)];

    return myArr;
  }

  /*
  * Given 2 int arrays, each length 2, return a new array length 4 containing
  * all their elements.
  */

  public int[] plusTwo(int[] a, int[] b) {
    int[] result = new int[4];

    result[0] = a[0];
    result[1] = a[1];
    result[2] = b[0];
    result[3] = b[1];

    return result;
  }

  /*
  * Given an array of ints, swap the first and last elements in the array.
  * Return the modified array. The array length will be at least 1.
  */

  public int[] swapEnds(int[] nums) {
    int[] result = new int[nums.length];
    int i;

    result[0] = nums[nums.length - 1];
    result[result.length -1] = nums[0];

    for (i = 1; i < nums.length - 1; i++) {
      result[i] = nums[i];
    }

    return result;
  }

  /*
  * Given an array of ints of odd length,
  * return a new array length 3 containing the elements from the middle of the array.
  * The array length will be at least 3.
  */

  public int[] midThree(int[] nums) {
    int[] result = new int[3];

    result[0] = nums[(nums.length / 2) - 1];
    result[1] = nums[(nums.length / 2)];
    result[2] = nums[(nums.length / 2) +1];

    return result;
  }

  /*
  * Given an array of ints of odd length, look at the first,
  * last, and middle values in the array and return the largest.
  * The array length will be a least 1.
  */

  public int maxTriple(int[] nums) {
    int max = nums[0];

    if (max < nums[nums.length / 2]) {
      max = nums[nums.length / 2];
    }

    if (max < nums[nums.length - 1]) {
      max = nums[nums.length - 1];
    }

    return max;
  }

  /*
  * Given an int array of any length, return a new array of its first 2 elements.
  * If the array is smaller than length 2, use whatever elements are present.
  */

  public int[] frontPiece(int[] nums) {
    if (nums.length <= 2) {
      return nums;
    }

    int[] result = new int[2];
    result[0] = nums[0];
    result[1] = nums[1];
    return result;
  }

  /*
  * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
  * Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions
  * in the array.
  */

  public boolean unlucky1(int[] nums) {
    int i;

    if (nums.length < 2) {
      return false;
    }
    if (nums[0] == 1 && nums[1] == 3) {
      return true;
    }
    if (nums.length > 2 && nums[1] == 1 && nums[2] == 3) {
      return true;
    }
     if (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
      return true;
    }
    return false;
  }

  /*
  * Given 2 int arrays, a and b, return a new array length 2 containing,
  * as much as will fit, the elements from a followed by the elements from b.
  * The arrays may be any length, including 0, but there will be 2 or more elements
  * available between the 2 arrays.
  */

  public int[] make2(int[] a, int[] b) {
    int[] result = new int[2];

    if (a.length > 1) {
      result[0] = a[0];
      result[1] = a[1];
    }

    if (a.length == 1) {
      result[0] = a[0];
      result[1] = b[0];
    }

    if (a.length == 0) {
      result[0] = b[0];
      result[1] = b[1];
    }
    return result;
  }

  /*
  * Given 2 int arrays, a and b, of any length,
  * return a new array with the first element of each array.
  * If either array is length 0, ignore that array.
  */

  public int[] front11(int[] a, int[] b) {

     if (a.length == 0 && b.length == 0) {
      int[] result = new int[0];
      return result;
    }

     if (a.length == 0 && b.length > 0) {
      int[] result = new int[1];
      result[0] = b[0];
      return result;
    }

     if (a.length > 0 && b.length == 0) {
      int[] result = new int[1];
      result[0] = a[0];
      return result;
    }
    int[] result = new int[2];

    if (a.length > 0 && b.length > 0) {
      result[0] = a[0];
      result[1] = b[0];
    }
    return result;
  }




}
