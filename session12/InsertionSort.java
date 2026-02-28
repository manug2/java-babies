
import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {


    int[] array = { 23, 1, 10, 5 , 2 };
    
    printMyArray(array);
    sort(array);
    printMyArray(array);

  }

  static void sort(int[] array) {

    for (int i = 1; i < array.length; i ++ ) {
  
      int key = array[i]; // my chosen element

      int j = i - 1; // helps us to seek position on the left

      while (j >= 0 && array[j] > key) {   // compare chosen element with items on left

        array[j + 1] = array[j]; // push bigger numbers to right

        j --;  // keep seeking numbers on the left

      }

      array[j + 1] = key; // place the chosen element at its correct position

      printMyArray(array);

    } // end of for loop

  }

  static void printMyArray(int[] array) {
    System.out.println(Arrays.toString(array));
  }


}
