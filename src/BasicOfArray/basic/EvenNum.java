package BasicOfArray.basic;

import java.util.Scanner;

public class EvenNum {

    static int EvenDigitNum(int[] arr){

        int count =0;

        for (int i=0; i<arr.length;i++){
            if (arr[i] % 2 == 0){
                count++;
            }
        }

        return count;

    }


    static void main(){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(EvenDigitNum(arr));

    }



}
