package Java;

import java.util.Scanner;

public class isoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base unit for isosceles triangle");
        isosceles(input.nextInt());
    }
    static void isosceles(Integer baseU){
        for (int i = 1; i <= baseU; i++) {
            for (int j = baseU; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
