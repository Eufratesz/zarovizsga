//package workhours;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.time.LocalDate;
//import java.util.List;
//
//public class WorkHours {
//
//
//
//
//
//
//    public List<String> readLines (BufferedReader reader) throws IOException{
//        String line;
//        while((line = reader.readLine()) != null) {
//            String []temp = line.split(",");
//            String name = temp[0];
//            int hours = Integer.parseInt(temp[1]);
//            LocalDate date = LocalDate.parse(temp[2]);
//            WorkHours workHours = new WorkHours(temp[0],temp[1], temp[2]);
//
//        }
//    }
//
//
//
//Path file= Path.of("src/test/resources/hu/nive/ujratervezes/zarovizsga/workhours/workhours.txt");
//    public String minWork(String file){
//
//    }
//}
