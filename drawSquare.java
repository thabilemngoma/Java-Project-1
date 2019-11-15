package Java;

import java.util.Scanner;

public class drawSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to form a square");
        square(input.nextInt());
    }
    static void square(Integer passedNumber){
        int count = passedNumber -1;
        while (passedNumber > 0){
            for (int c = 0; c < count; c++){
                System.out.print("#");
            }
            System.out.println("#");
            passedNumber--;
        }
    }
}
