import java.util.*;
public class Naturalno {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num;
        int sum = 0;
        num = sc.nextInt();
        for(int i =1; i <= num; i++) {
            sum = sum + i;
        }
            System.out.println("Sum of first " + num +" natural is " + sum);
    }
}
