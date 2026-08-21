package PatternPritings.solid;

import java.util.Scanner;

public class SolidRhombus {

    static void main(){

        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
//        for (int i=n; i>=1;i--){
//            for (int j=i; j>=1;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for (int row = 1; row<=n; row++){
//
//            //for each row -> space, stars
//
//            // spaces
//            for (int col =1; col<=n-row; col++ ){
//                System.out.print(" ");
//            }
//
//            // starts
//            for (int col = 1; col<=n; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//
//        }



        for (int row=1; row<=n;row++){

            // spaces
            for (int col = 1; col<=n-row; col++){
                System.out.print(" ");
            }

            // stars
            for (int col = 1; col<=n; col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }







    }



}
