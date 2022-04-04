package Task2;

import java.util.ArrayList;
import java.util.List;

public class PointCheck {

    public static void CheckPoints(Circle circle) {
        List<Float> keyList = new ArrayList<>(circle.getCoordinatesx());
        List<Float> valueList = new ArrayList<>(circle.getCoordinatesy());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < keyList.size(); i++) {
            float x = keyList.get(i);
            float x0 = circle.getCenterx();
            float y = valueList.get(i);
            float y0 = circle.getCentery();
            float R = circle.getRadius();
            double v = Math.pow(x - x0, 2) + Math.pow(y - y0, 2);
            if (v == Math.pow(R, 2)) {
                result.add(0);
            }
            if (v < Math.pow(R, 2)) {
                result.add(1);
            }
            if (v > Math.pow(R, 2)) {
                result.add(2);
            }

        }
        PrintResult(result);
    }

    public static void PrintResult(List<Integer> result) {
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
}
