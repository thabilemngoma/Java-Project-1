package Java;

import java.util.Scanner;

public class CheckEven {
    public static void main(String[] args) {
        Scanner givenNum = new Scanner(System.in);
        System.out.println("Enter number to check if it is even or odd:");
        even_or_odd(givenNum.nextInt());
    }
    static void even_or_odd(Integer n){
        if(n % 2 == 0){System.out.println("Even");
        }else {System.out.println("Odd");
        }
    }
}

