import java.util.*;
public class PostivenoSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        int sum =0;
        int counter = 0;
        num = sc.nextInt();
        while(num > 0) {
            counter++;
            sum = sum + num;
            num = sc.nextInt();
        }
            System.out.println("sum :" + sum);
        }
    }

