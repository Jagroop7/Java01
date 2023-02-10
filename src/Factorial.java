import java.util.*;
public class Factorial {
    public static void main(String args[]){
        int i,num, fact =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        num = sc.nextInt();
        for(i = 1;i <= num; i++ ) {
            fact = fact * i;
        }
            System.out.println("Factorial of number " + num + "is " + fact);

    }
}
