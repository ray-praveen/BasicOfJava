package BasicOfArray.basic;

import java.util.Scanner;

public class SumAllElements {

    static void main(){

        // Sum of All Elements

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sum=0;

        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println(sum);

        sc.close();


    }

}
