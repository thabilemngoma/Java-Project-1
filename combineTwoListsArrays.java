package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class combineTwoListsArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many integers you want to put on both list?: ");
        int number = input.nextInt();
        Integer[] listA = new Integer[number];
        Integer[] listB = new Integer[number];
        System.out.println("Now enter the " +number+" integers for list A:");
        for (int i=0;i<number;i++){
            listA[i] = input.nextInt();
        }
        System.out.println("Now enter the " +number+" items for list B:");
        for (int i=0;i<number;i++){
            listB[i] = input.nextInt();
        }
        System.out.println(combine(listA,listB));
    }
    static List<Integer> combine(Integer[] aList, Integer[] bList){
        List<Integer> Combo = new ArrayList<>();
        for (int i=0; i<aList.length;i++){
                Combo.add(aList[i]);
                Combo.add(bList[i]);
            }
        return Combo;
    }
}
