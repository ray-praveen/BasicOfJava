package methods;

public class voidVsnonvoid {

    // void method
    static void printMultiplication(int a, int b){
        int ans = a * b;
//        return;
        System.out.println("Result: " + ans);
//        return;  // return datatype keyword
    }

    // non void method

    static int printAdd(int a, int b){

        int sum = a + b;
        return sum;

    }

    static void main(){

        printMultiplication(5, 10); // in void case no need to sout print

        int result = printAdd(5, 10);
        System.out.println(result); // but in non void case need to store return type in int or any datatype;


    }

//    static int printAdd(int a, int b){
//
//        int sum = a + b;
//        return sum;
//
//    }
}
