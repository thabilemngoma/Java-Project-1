import java.util.Scanner;

public class rightHandedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height of your right handed triangle: ");
        triangle(input.nextInt());
    }
    static void triangle(Integer height){
        for (int c=1;c<=height;c++){
            System.out.println(" ");
            for (int i=1;i<=c;i++){
                System.out.print("#");
            }
        }
    }
}
