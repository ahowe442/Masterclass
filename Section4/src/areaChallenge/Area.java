package areaChallenge;

public class Area {

    private static double area(double radius) {
        boolean isValid = false;
        if (radius > 0) {
            isValid = true;
        }
        double area = 0;
        if (isValid == true) {
            area = 3.14 * radius * radius;
            System.out.println(area);


        } else if (isValid == false) {
            return -1;
        }

        return area;
    }

    private static double area(double x, double y) {
        boolean isValid = false;
        if (x > 0 && y > 0) {
            isValid = true;
        }
        double area = 0;
        if (isValid == true) {
            area = x * y;
            System.out.println(area);
            return area;

        } else if (isValid == false) {
            return -1;
        }

        return area;
    }


}
