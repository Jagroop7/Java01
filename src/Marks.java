import java.util.Scanner;
public class Marks {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
        System.out.println("Enter the Marks:");

            double marks = sc.nextDouble();
            if (marks >= 90) {
                System.out.println("You are a Champion");
            } else if (marks >= 70 && marks <= 89) {
                System.out.println("You are Excellent");
            } else if (marks >= 60 && marks <= 69) {
                System.out.println("You are very Good");
            } else if (marks >= 50 && marks <= 59) {
                System.out.println("You are good");
            }
            else if(marks <= 40){
                System.out.println("Fail");
            }
            else{
                System.out.println("Invalid");
            }
            System.out.println("User want to continue ? (Yes(1) or No(0))");
            input = sc.nextInt();
        }while(input == 1);
    }


    }
