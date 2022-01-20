package ss15_debug_and_exception.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] Exception(){
        Integer [] arr= new Integer[100];
        Random random= new Random();
        System.out.println("các giá trị trong mảng là");
        for(int i=0;i<100;i++){
            arr[i]=random.nextInt(100);
            System.out.print(arr[i]+" + ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        Integer [] arr= arrayExample.Exception();
        System.out.println("  ");
        System.out.println(" mời nhập vị trí cần tìm giá trị trong mảng ");
        Scanner scanner=new Scanner(System.in);
        int x;
        while (true){
            x=scanner.nextInt();
            try{
                System.out.println("vị trí phần tử: "+ x+ " có giá trị là: "+ arr[x]);
            }catch(IndexOutOfBoundsException e){
                System.out.println(" phần từ nhập vào nàm ngoài mảng ");
            }
        }
    }
}
