package BasicOfArray.basic.lecture.twodarray;

import java.util.Scanner;

public class TwodArray {

       static void main(){

           // declaration
//           int[][] arr;

           //allocation
//           arr = new int [3][4];

           //initialize

//           int[][] brr = {
//                   {1, 2},
//                   {2, 3},
//                   {3, 4},
//                   {4, 5}
//           };
////           System.out.println(brr[3][1]);
//
//           int rowLength = brr.length;
//           int colLength = brr[0].length;
//
//           for (int i=0; i<=rowLength-1; i++){
//               for (int j = 0; j<=colLength-1; j++){
//                   System.out.print(brr[i][j] + " ");
//               }
//               System.out.println();
//           }
//
//           int[][] brr = {
//                   {1, 2},
//                   {2, 3, 4, 5},
//                   {3, 4, 4, 5, 6, 7},
//                   {4}
//           };
//
//           int rowLength = brr.length;
////           int colLength = brr[0].length;
//
////           for (int rowIndex=0; rowIndex<=rowLength-1; rowIndex++){
////               //jaise hi main kisi new row me aaya
////               //same pointer pr maine uss row ka colLength find out kr liya
////               //current row -> brr[rowIndex]
////               // isme kitne colums -> brr[rowIndex].length
////               int colLength  = brr[rowIndex].length;
////               for (int colIndex = 0; colIndex<=colLength-1; colIndex++){
////                   System.out.print(brr[rowIndex][colIndex] + " ");
////               }
////               System.out.println();
////           }
//
//           // traversal 2-D array
//           for (int rowIndex = 0; rowIndex <= brr.length-1; rowIndex++){
//               for (int colIndex=0;colIndex<=brr[rowIndex].length-1; colIndex++){
//                   System.out.print(brr[rowIndex][colIndex] + " ");
//               }
//               System.out.println();
//           }

           int[][] arr = new int[3][4];

           Scanner sc = new Scanner(System.in);

           for (int i = 0; i<=arr.length-1; i++){
               for (int j=0; j<=arr[i].length-1; j++){
                   System.out.println("Provide value for row= " + i+  " col= " + j);
                   arr[i][j] = sc.nextInt();
               }
           }

           // i<n or i<n-1 same meaning
           //print

           for (int rowIndex = 0; rowIndex <= arr.length-1; rowIndex++){
               for (int colIndex=0;colIndex<=arr[rowIndex].length-1; colIndex++){
                   System.out.print(arr[rowIndex][colIndex] + " ");
               }
               System.out.println();
           }
       }

}
