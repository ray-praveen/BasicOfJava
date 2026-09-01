package BasicOfArray.basic.lecture.twodarray;

import java.util.Scanner;

public class Practice {


    static int printSum(int[][] arr){

        int sum = 0;

        for (int rowIndex=0; rowIndex< arr.length; rowIndex++){

            for (int colIndex =0; colIndex<arr[rowIndex].length; colIndex++){

                sum += arr[rowIndex][colIndex];

            }

        }
        return sum;

    }

    static void main(){

        Scanner sc = new Scanner(System.in);

//        int n= sc.nextInt();
//        int m= sc.nextInt();

//        int[][] arr = new int[n][m];

        int[][] arr = {{1, 2, 3}, {1, 2, 3}};
        for (int i =0; i<arr.length;i++){
            for (int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }

            int result = printSum(arr);
            System.out.println(result);
        }

    }

}
