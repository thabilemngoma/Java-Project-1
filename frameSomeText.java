package Java;

import java.util.Scanner;

public class frameSomeText {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = 0;
        System.out.println("How many words you want to frame?: ");
        size = Integer.parseInt(input.nextLine());
        String[] inputs = new String[size];
        System.out.println("Now enter "+ size+ " words");
        for (int i = 0; i < size; i++) {
            inputs[i] = input.nextLine();
        }
        System.out.print("*");
        frame(inputs);
        input.close();
    }
    static void frame(String[] words){

        int maxsize = 0;
        for (String s : words) {
            if (s.length() > maxsize) {
                maxsize = s.length();
            }
        }
        for (int i = 0; i <= maxsize + 1; i++) {
            System.out.print("*");
        }
        System.out.print("*");
        System.out.println();
        for (int j = 0; j < words.length; j++) {
            System.out.print("* " + words[j]);
            for (int i = words[j].length(); i <= maxsize; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.print("*");
        for (int i = 0; i <= maxsize + 1; i++) {
            System.out.print("*");
        }
        System.out.print("*");
        System.out.println();

    }
}
