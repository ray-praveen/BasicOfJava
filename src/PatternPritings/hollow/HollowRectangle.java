package PatternPritings.hollow;

import java.util.Scanner;

public class HollowRectangle {

    static void main(){

        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        for (int row =1; row<=n; row++){

            // for 1 and last row


                for (int col = 1; col <= 6; col++){
                    if (row == 1 || row == n) {
                        System.out.print("* ");
                    }else{
                        if (col == 1){
                            System.out.print("* ");
                        }else if (col==6){
                            System.out.print("* ");
                        }else {
                            System.out.print("  ");
                        }
                    }
                }

            System.out.println();

        }


    }

}
