package Task2;

public class Main {

    public static void main(String[] args) {

        Circle circle = ReadFile.ReadCenterandRadius();
        ReadFile.ReadCoordinates(circle);
        PointCheck.CheckPoints(circle);


    }
}
