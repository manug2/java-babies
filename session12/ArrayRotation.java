import java.util.Arrays;


public class ArrayRotation {

  public static void main(String[] args) {

    int [] array = {4, 7, 9, 11, 15};
    System.out.println (Arrays.toString(array));
    rotate(array);
    System.out.println (Arrays.toString(array));
    rotate(array);
    System.out.println (Arrays.toString(array));
  }

  public static void rotate(int[] array) {
    int temp = array[array.length-1];
    
    for (int j = array.length -1; j > 0; j--) {
       array[j] = array[j-1];
    }

    array[0] = temp;
  }

}

