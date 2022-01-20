package ss15_debug_and_exception.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println(" moi nhap vao canh 1");
            int  edgeA = scanner.nextInt();
            System.out.println(" moi nhap vao canh 2");
            int  edgeB = scanner.nextInt();
            System.out.println(" moi nhap vao canh 3");
            int  edgeC = scanner.nextInt();
            try {
                Triangle triangle = new Triangle(edgeA,edgeB,edgeC);
                System.out.println(" tam giac hop le");
                break;
            } catch (ExceptionRectangle exceptionRectangle) {
                exceptionRectangle.printStackTrace();
            }
        }

    }
}
