import java.util.Arrays;
public class CodeSnippet2 {
   public static void main(String args[]) {
      //Creating an array
      int myArray[] = new int[7];
      //Populating the array
      myArray[0] = 1254;
      myArray[1] = 1458;
      myArray[2] = 5687;
      myArray[3] = 1457;
      myArray[4] = 4554;
      myArray[5] = 5445;
      myArray[6] = 7524;
      //Printing Contents using for each loop
      System.out.println("Contents of the array: ");
      for (int element: myArray) {
         System.out.println(element);
      }
   }
}
