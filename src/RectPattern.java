public class RectPattern {
    public static void main(String args[]) {
        int i=1;
        //outer loop
        // SOLID RECTANGLE
       // for(int i = 1; i <= 5; i++) {
        while(i <=5){
            i++;
        //inner loop
            for(int j= 1; j <= 5; j++){
              System.out.print("*");
        }
        System.out.println();
         }
    }
}