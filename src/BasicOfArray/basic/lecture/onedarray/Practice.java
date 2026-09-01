package BasicOfArray.basic.lecture.onedarray;

import java.util.Scanner;

public class Practice {

    // sum of values in array

    static int printSum(int[] arr){
        int sum =0;
        for (int i=0; i<=arr.length-1; i++){
            sum += arr[i];
        }
        return sum;

    }

    // multiply
    static int printMul(int[] arr){

        int pro = 1;
        for (int i=0; i<=arr.length-1; i++){
            pro *= arr[i];
        }
        return pro;
    }

    // max element

    static int maxElement(int[] arr) {

        int max = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    // min
    static int minElement(int[] arr) {

        int min = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }


    static void main(){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr =new int[n];

        for(int i=0; i<=n-1; i++){

            arr[i] = sc.nextInt();

        }

//        int result = printSum(arr);
//        int result = printMul(arr);
//        int result = maxElement(arr);
        int result = minElement(arr);


        System.out.println(result);

    }


}
