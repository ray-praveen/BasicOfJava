package conditionals;

import java.util.Scanner;

public class SwitchCase {

    static void main(){

        System.out.println("Enter a value for day: " );

        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("WednesDay");
                break;

            case 4:
                System.out.println("Thusday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Sunday");
        }

    }

}
