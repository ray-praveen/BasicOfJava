package PatternPritings.solid;

import java.util.Scanner;

public class InvertedRA {

    static  void main(){

        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

//        for (int row = 1; row<=n; row++ ){
//            for (int col = 1; col<=n-row+1; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int row=1; row<=n; row++){
            for (int j = 1; j<=n-row; j++){
                System.out.print("* ");
            }
            System.out.println();
        }












    }
}
