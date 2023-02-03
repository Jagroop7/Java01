public class Patterns{
    public static void main(String args[]) {
        //int r = 4;
        //int c = 5;

        //outer loop
        // SOLID RECTANGLE
        //for(int i = 1; i <= 4; i++) {
        //inner loop
        //for(int j= 1; j <= 8; j++){
        // System.out.print("*");
        //}
        // System.out.println();
        // }
        // HOLLOW RECTANGLE
        // int n = 4;
        // int m = 5;
        //for(int i = 1; i <= n; i ++) {
        // for(int j = 1; j <= m; j ++){
        // if(i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // HALF PYRAMID / RIGH ANGLE TRIANGLE

        //int n = 4;
        //for(int i = 1; i <= n; i ++){
        // for(int i = n; i >= 1; i--){ // INVERTED RIGHT ANGLE TRIANGLE
        // for(int j = 1; j <= i; j ++){
        //  System.out.print("*");
        // }
        // System.out.println();
        // }

        //

        //int n = 4;
        // for(int i = 1; i <=n; i ++){
        // print space

        // for(int j = 1; j <=n-i; j ++) {
        //  System.out.print(" ");
        //  }
        //print star, INNER LOOP
        //  for(int j = 1; j <=i;j ++){
        //  System.out.print("*");
        //  }
        //  System.out.println();
        // }

        //print no.s in pattern

        // int n= 5;
        // for(int i = 1; i <= n; i ++) {
        //   for(int j = 1; j <= i; j ++){
        //   System.out.print(j+" ");
        // }
        //  System.out.println();
        // }

        // int n = 5 ;
        // for(int i = 1; i <= n; i++){
        //  for(int j = 1; j <= n-i+1; j++){
        //    System.out.print(j+" ");
        //  }
        // System.out.println();
        // }

        // FLOYD'S TRIANGLE

        // int n = 5;
        // int num =1;
        // for(int i = 1; i <=n; i++){
        //  for(int j = 1; j <= i; j++){
        //     System.out.print(num+" ");
        //    num ++;
        // }
        // System.out.println();
        // }

        //  ALTERNATIVE BINARY NUMBER DISPLAY IN TRIANGLE

        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                int sum = i+j;
                if(sum %2 == 0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }

    }
}
