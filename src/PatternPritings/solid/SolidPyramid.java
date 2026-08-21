package PatternPritings.solid;

import java.util.Scanner;

public class SolidPyramid {

    static  void main(){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//        for (int row = 1; row<=n;row++){
//
//            //spaces
//            for (int col= 1; col<=n-row-3; col++){
//                System.out.print("* ");
//            }
//
//            // star
//
////            for (int col=1; col<=7; col++){
////
////                    System.out.print("* ");
////
////            }
//
//
//            System.out.println();
//
//        }


        for (int row = 1; row<=n; row++){

            //spaces
            for (int col = 1; col <= n-row; col++){
                System.out.print(" ");
            }

            // stars
            for (int col = 1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();

        }


    }

}
