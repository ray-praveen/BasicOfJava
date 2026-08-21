package LoopInJava;

import java.util.Scanner;

public class HomeWork {

    static void main(){

        Scanner sc = new Scanner(System.in);

        // Print counting from 1 to n!!
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println(i);
        }

        // Print counting from n to 1


        for (int i=n; i>=1; i--){
            System.out.println(i);
        }

        // Print the 10 multiples of n

        for (int i=1; i<=n;i++){

            System.out.println(n*i);
        }

        // Print your name 100 times

        for(int i=1; i<=100000; i++){
            System.out.println("Praveen Ray");
        }

        // Print all prime numbers from 1 to 100


       for (int i=2; i<=100; i++){

           int count=0;

           for (int j=1;j<=i;j++){
               if (i % j == 0){
                   count++;
               }
           }
           if (count==2){
               System.out.println(i);
           }

       }

        // Print all even numbers from 1 to 100

        for (int i=1; i<=100; i++){
            if(i %2 ==0){
                System.out.println(i);
            }
        }

        // Print the sum of all the numbers from 1 to n

        int sum=0;
        for(int i=1; i<=n;i++){
            sum += i;

        }
        System.out.println(sum);

        // Print all integers in range from 50 to 100, that are perfectly divisible by 7


        for (int i = 1; i<=n; i++){
            if (i >= 50 && i<=100){
                if (i % 7 ==0){
                    System.out.println(i);
                }

            }
        }

    }

}
