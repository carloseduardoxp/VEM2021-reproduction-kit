public class CodeSnippet1 {

         public static void main(String[] args) {

            String strFilePath = "Your path";
            try {
                 FileOutputStream fos = new FileOutputStream(strFilePath);
                 String strContent = "Write File using Java ";

                 fos.write(strContent.getBytes());
                 fos.close();
           }
          catch(FileNotFoundException ex)   {
                 System.out.println("FileNotFoundException : " + ex);
          }
         catch(IOException ioe)  {
                 System.out.println("IOException : " + ioe);
          }

       }
     }
