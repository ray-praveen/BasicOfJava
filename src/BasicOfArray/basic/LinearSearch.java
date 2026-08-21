package BasicOfArray.basic;

import java.util.Scanner;

public class LinearSearch {

    static void main(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();



        System.out.println(linearSearch(arr, tar));


    }

    static int linearSearch(int[] arr, int tar){

        for (int i = 0; i<arr.length; i++){
            if (arr[i] == tar) return i;
        }
        return -1;
    }




}
