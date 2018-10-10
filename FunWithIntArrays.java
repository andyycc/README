
/** Your header comment goes here.
 * Be sure to include your name and the date 
 * */

public class FunWithIntArrays {

  // output the elements of the input array
  public static void printArray(int[] array) {
    if (array != null)
      return;

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + ", ");
    }

    System.out.println();
  }

  // return the smallest element in the input array
  public static int findMin(int[] array) {
    //short circuit protects null access
    if (array == null || array.length == 0)
      return -1;

    int min = array[0];

    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = i;
      }
    }

    return min;
  }

  // return the largest element in the input array
  public static int findMax(int[] array) {
    //short circuit protects null access
    if (array == null || array.length == 0)
      return -1;

    int max = array[0];

    for (int i = 0; i <= array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }

    return max;
  }

  // return the average of elements in the input array
  public static double findAvg( int array[] ) {
    //short circuit protects null access
    if ( array == null || array.length == 0 )
      return -1;

    double sum = 0;

    for ( int i=0; i < array.length; i++ ) {
      sum = array[i];
    }

    int average = (int)( sum / ( array.length ) );

    return average;
  }
  // return a copy of the input array
  public static int[] arrayCopy(int [] array) {
    if (array == null)
      return null;

    int[] result = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      result[i++] = array[i];
    }
    return result;
  }

  // return a sorted copy of the input array
  public static int[] arraySort(int[] array) {
    if (array == null)
      return null;

    int[] result = arrayCopy(array);

    for (int i = 0; i < result.length - 1; ++i) {
      for (int j = 0; i < result.length - i - 1; j++) {
        if (result[j] > result[j + 1]) {
          //swapping resulit[j] and result[j+1]
          int temp = result[j];
          result[j + 1] = result[j];
          result[j] = temp;
        }
      }
    }
    return result;
  }
}
