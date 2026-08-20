import java.math.BigInteger;
import java.util.Scanner;

public class Input {
    static void main(){

        //hardcode value

//        int a=5;
//        int b=1;
//        System.out.println(a+b);

        //take input from users
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for firstNum: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the value for secondNum: ");
        int secondNum = sc.nextInt();
        int add = firstNum + secondNum;
        System.out.println(add);

        // Big integger

        BigInteger bg = sc.nextBigInteger();
        System.out.println(bg);

        // boolean
        System.out.println("Enter the value: ");
        boolean flag = sc.hasNextBoolean();
        System.out.println("Enter the value: ");
        short shotVal = sc.nextShort();
        System.out.println("Enter the value: ");
        float floatValue = sc.nextFloat();

        System.out.println(flag);
        System.out.println(shotVal);
        System.out.println(floatValue);

        sc.close(); // best practice to avoid resource leak

    }
}