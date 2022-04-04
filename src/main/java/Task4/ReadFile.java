package Task4;

import Task2.Circle;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static List<Integer> readFile() {
        try {
            Scanner in = new Scanner(System.in);
            FileReader fileReader = new FileReader(in.nextLine());
            Scanner scanner = new Scanner(fileReader);
            List<Integer> result = new ArrayList<>();
           while(scanner.hasNextInt()){
               result.add(scanner.nextInt());
           }
            return result;
        } catch (
                FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
