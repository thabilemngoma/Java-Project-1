package Java;

import java.util.Scanner;

public class helloC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        hello(input.nextLine());
    }
    static void hello(String passedName){
        System.out.println("Hello "+ passedName + "!");
    }
}
