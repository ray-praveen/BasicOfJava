package BasicOfArray.basic.lecture.onedarray;

import java.util.Scanner;

public class ForEachLoop {

    static void main(){
//        int[] arr ={10, 20, 30};
//
//        // for each value
//        for (int val: arr){
//            System.out.println(val);
//        }

        // taking input in array

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i=0;i<=num-1; i++){
            System.out.println("Provide input for index " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("O/p: ");
        for (int val: arr){
            System.out.println(val);
        }

    }

}
