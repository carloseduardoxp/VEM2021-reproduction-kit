public class CodeExample2 {

    public static void main(String[] args) throws Exception {
          //Build reader instance
          CSVReader reader = new CSVReader(new FileReader("rawtest.csv"), ',', '"', 1);
          CSVWriter writer = new CSVWriter(new FileWriter(csv));

          //Read all rows at once
          List<String[]> allRows = reader.readAll();

          //Read CSV line by line and use the string array as you want
         for(String[] row : allRows){
             String changedString = Arrays.toString(row).replace("[", ""); // This is an example for parsing
             System.out.println(changedString);

         }

         // Here I do not know what to do to write the parsed data back to a .csv
         for(String[] output : allRows) {

             //get current row
             String[] parsedRow=new String[output.length];
             for(int i=0;i<output.length;i++){
                //parse each column
                parsedRow[i]=output[i].replace("[", "");
             }

             //write line
             writer.writeNext(parsedRow);


         }
         writer.close();
    }
}

