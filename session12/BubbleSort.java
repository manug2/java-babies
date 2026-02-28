
import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {


    int[] array = { 23, 1, 10, 5 , 2 };
    
    printMyArray(array);
    sort(array);
    printMyArray(array);

  }

  static void sort(int[] array) {
    for( int i = 1; i<array.length;i++) {

      for( int j=i-1; j>=0;j--) {

        if(array[j+1]<array[j]){ // if two numbers are out of order, the swap them

          int temp = array[j]; // copy value of one number
          array[j]=array[j+1]; // replace value by second number
          array[j+1]=temp;     // replace second number by first number value
        }
      }

      printMyArray(array);
    }
  }

  static void printMyArray(int[] array) {
    System.out.println(Arrays.toString(array));
  }


}
