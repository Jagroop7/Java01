import java.util.*;
public class SumOfEvenOddNum {
    public static void main(String args[]) {
        int num;
        int sumOfEven =0;
        int sumOfOdd =0;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please Enter any Number : ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++)
        {
            if(i % 2 == 0)
            {
                sumOfEven = sumOfEven + i;
            }
            else
            {
                sumOfOdd = sumOfOdd + i;
            }
        }
        System.out.println("The Sum of Even Numbers upto " + num + "  =  " + sumOfEven);
        System.out.println("The Sum of Odd Numbers upto " + num + "  =  " + sumOfOdd);
    }
}




