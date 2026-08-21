package BasicOfArray.basic;

import java.util.Scanner;

public class Sum1dArray {

    static int Sum1dArray(int[] arr){

        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
            System.out.println(sum);
        }

        return sum;

//        for (int i = 1; i < arr.length; i++) {
//            arr[i] = arr[i] + arr[i - 1];
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        return arr[arr.length - 1];


    }

    static void main(){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i =0; i<n; i++){

            arr[i] = sc.nextInt();

        }

        Sum1dArray(arr);


    }

}
