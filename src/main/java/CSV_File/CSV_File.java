//package CSV_File;
//
////import com.opencsv.CSVReader;
////
////import com.opencsv.CSVReaderBuilder;
////
////import com.opencsv.CSVWriter;
////
////import com.opencsv.exceptions.CsvException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class CSV_File {
//
//
//
//    public static void main(String[] args) throws IOException, CsvException {
//
//        FileReader fileReader = new FileReader("D:\\fileIO\\result.csv");
//        //create csvReader object //stream i
//        CSVReader csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();
//        List<String[]> allData = csvReader.readAll();
//        System.out.println("Reader ===> "+allData);
//
//        for(String[] row : allData){
//            for(String cell : row ){
//                System.out.print(cell);
//            }
//            System.out.println();
//        }
//
//        csvReader.close();
//
//
//        FileWriter outputfile = new FileWriter("D:\\fileIO\\written.csv");
//        CSVWriter writter = new CSVWriter(outputfile);
//        List<String[]> Data = new ArrayList<String[]>();
//
//        Data.add(new String [] {"Name", "LastName","City"});
//        Data.add(new String [] {"sachin", "lagad","Nager"});
//        Data.add(new String [] {"Saurav", "Raj","Bangalore"});
//
//        writter.writeAll(Data);
//        writter.close();
//
//
//
//    }
//
//
//
//}
