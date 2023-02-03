import java.util.*;
public class Loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int sum = 0;
        //for(int i = 1;i <=5;i++){
        // sum = sum + i;
        //}
        //System.out.println(sum);
        //table of 2
        //for(int i = 1;i <= 10;i++){
        // System.out.println(n*i);
        //}
        // While Loop

        // int i = 1;
        //while(i <= 10){
        //  System.out.println(n*i);
        // i++;
        // }

        //do While Loop
        int i = 1;
        do {
            System.out.println(n*i);
            i++;
        }while(i <= 10);
    }

}
