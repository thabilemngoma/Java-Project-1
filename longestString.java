package Java;

import java.util.Scanner;

public class longestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many names you have in mind?: ");
        int number = input.nextInt();
        String arr[] = new String[number+1];
        System.out.println("Now enter the " +number+" names you were thinking of:");
        for (int i=0;i<=number;i++){
            arr[i] = input.nextLine();
        }
        System.out.println(longest(arr));
    }
    static String longest(String names[]){
        int count = 0;
        String longestWord = "";
        for (String x: names){
            if(x.length()>=count){
                count = x.length();
            }
        }
        for (String word: names){
            if(word.length() == count){
                longestWord += word +"\n";
            }
        }
        return longestWord;
    }
}
