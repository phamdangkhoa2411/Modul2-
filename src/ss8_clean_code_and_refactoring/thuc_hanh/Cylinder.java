package ss8_clean_code_and_refactoring.thuc_hanh;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getRadius(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static int getRadius(int radius) {
        return radius;
    }

    private static double getBaseArea(int radius) {

        return Math.PI * radius * radius;
    }
}
