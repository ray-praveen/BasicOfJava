package LoopInJava;

public class ForLoop {

    static void main()
    {

        //first loop

        for(int i=1; i<=5; i++){
            System.out.println("Value of i: " + i);
        }

        // Second loop

        for(int i=1; i<=4; i++){
            System.out.println("Hello!!");
        }

        // Third Loop
        for(int i=1; i<=10; i += 2){
            System.out.println(i);
        }
        for(int i=2; i<=20; i += 2){
            System.out.println(i);
        }

        //NestedLooop

        for(int i= 1; i<=4; i++){
            for(int j= 1; j<=4; j++){
                System.out.print("* ");

            }
            System.out.println();
        }

        for(int i=1; i<=4;i++){
            for (int j= 1; j<=4; j++){
                System.out.println("i = " + i  +", j= " + j);
            }
        }

        // Break And Continue loop

        for (int i= 1; i<=10;i++){
            if (i==5){
                break;  //i ==5 loop breaking condition overall loop end not next iteration if possible
            }
            System.out.println();
        }

        // nested loop agar inner loop me break hai toh sirf inner se hi end loop hoga par outer loop chalega only

        // Continue

        for (int i=1; i<=10;i++){
            if (i==5){
                continue; // skip the iteration
            }
            System.out.println(i);
        }

    }
}
