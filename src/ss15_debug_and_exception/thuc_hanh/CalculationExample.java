package ss15_debug_and_exception.thuc_hanh;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" moi nhap phan tu a");
        int a= scanner.nextInt();
        System.out.println(" moi nhap phantu b");
        int b= scanner.nextInt();
        CalculationExample calculationExample= new CalculationExample();
        calculationExample.calcula(a,b);

    }


    public  void calcula(int a, int b){

        try{
            int i= a+b;
            int k= a-b;
            int l= a*b;
            int m= a/b;

            System.out.println(" tong a+b = "+ i);
            System.out.println(" tong a-b = "+ k);
            System.out.println(" tong a*b = "+ l);
            System.out.println(" tong a/b = "+ m);

        }catch(Exception e){
            System.out.println(" kiểu dũ liêu bạn nhập vào bị sai ");
        }


    }
}
