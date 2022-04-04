package Task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static Circle ReadCenterandRadius() {
        try {
            Scanner in = new Scanner(System.in);
            FileReader fileReader = new FileReader(in.nextLine());
            Scanner scanner = new Scanner(fileReader);
            Float centerx = scanner.nextFloat();
            Float centery = scanner.nextFloat();
            Float radius = scanner.nextFloat();
            return new Circle(centerx, centery, radius);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void ReadCoordinates(Circle circle) {
        try {
            Scanner in = new Scanner(System.in);
            FileReader fileReader = new FileReader(in.next());
            Scanner scanner = new Scanner(fileReader);
            List<Float> coordinatesx = new ArrayList<>();
            List<Float> coordinatesy = new ArrayList<>();
            while (scanner.hasNextFloat()) {
                coordinatesx.add(scanner.nextFloat());
                coordinatesy.add(scanner.nextFloat());
            }
            circle.setCoordinatesx(coordinatesx);
            circle.setCoordinatesy(coordinatesy);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
