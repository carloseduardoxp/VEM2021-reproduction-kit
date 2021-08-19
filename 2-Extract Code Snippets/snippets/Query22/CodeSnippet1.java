// Java program to iterate over an array
// using for loop
import java.io.*;
class CodeSnippet1 {
  
    public static void main(String args[]) throws IOException
    {
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int i, x;
  
        // iterating over an array
        for (i = 0; i < ar.length; i++) {
  
            // accessing each element of array
            x = ar[i];
            System.out.print(x + " ");
        }
    }
}
