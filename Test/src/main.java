import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.printf("hello there");
        String fileName = "/home/nahid/Documents/cfgcode.txt";
        File file = new File(fileName);
        Scanner scan = new Scanner(file);
        ArrayList<String> Lines = new ArrayList<>();

        while (scan.hasNextLine()) {
            String currentLine = scan.nextLine();
            //currentLine = currentLine.replaceAll("\\s","");
            Lines.add(currentLine);
        }
        CalculateCFG calc = new CalculateCFG();
        calc.calculate(Lines);
//        for(int i=0; i<Lines.size(); i++){
//            System.out.println(Lines.get(i) + " Mohsin");
//        }


    }
}
