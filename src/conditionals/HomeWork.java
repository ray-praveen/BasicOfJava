package conditionals;

import java.util.Scanner;

public class HomeWork {

    static void main(){

        Scanner sc = new Scanner(System.in);
//
        // Take age input and print if he/she is eligible to vote or not

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("he/she is eligible to vote");
        }else {
            System.out.println("Not eligible");
        }

//         Take input 5 subject's marks and print the overall percentage of student.

        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int mark4 = sc.nextInt();
        int mark5 = sc.nextInt();

        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        double percentage = total / 5.0;

        System.out.println(percentage);

        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


        // Take input a lowercase character and print its uppercase version

        System.out.println("Enter the lowerCase: ");
        char lc = sc.next().charAt(0);

        if  (lc >= 'a' && lc <= 'z'){
//            char uppercase = (char) (lc -32);
            char uppercase = Character.toUpperCase(lc); // to convert lower to uppercase
            System.out.println(uppercase);
        }else {
            System.out.println("Lowe Case");
        }

        // Take input a lowercase character and print its uppercase version

        char up = sc.next().charAt(0);

        if (up >= 'A' && up <='Z'){
//            char lowercase = (char) (up + 32);
            char lowercase = Character.toLowerCase(up);
            System.out.println(lowercase);
        }else {
            System.out.println("Uppercase");
        }

        // Take input 5 subject's marks, drop the least  one and calculate the overall percentage considering only the top marks print it.

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

//        SwitchCase(){
//
//
//        }

    }


}
