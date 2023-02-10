import java.util.*;
public class ReverseNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        int r;
        System.out.println("Enter the number:");
        num = sc.nextInt();
        while(num > 0)
        {
           r= num % 10;
           System.out.print(r);
           num = num/10;
        }
    }
}
