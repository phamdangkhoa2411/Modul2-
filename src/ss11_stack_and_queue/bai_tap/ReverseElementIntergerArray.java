package ss11_stack_and_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ReverseElementIntergerArray {
    public static void main(String[] args) {

//Đảo ngược phần tử trong mảng số nguyên sử dụng Stack
        Stack<Integer> myStack = new Stack<>();
        Integer[] integer = new Integer[3];
        integer[0] = myStack.push(1);
        integer[1] = myStack.push(2);
        integer[2] = myStack.push(5);

        for (Integer integers :integer){
            System.out.print(integers+" ");
        }
        System.out.println();
        integer[0] = myStack.pop();
        integer[2] = myStack.push(1);

        for (Integer integers :integer){
            System.out.print(integers+" ");
        }
    }

}


