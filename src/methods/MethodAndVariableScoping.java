package methods;

public class MethodAndVariableScoping {

    static void printMul(){
        int value = 20; //don't excess by any other methods
        for(int i=1; i<=10;i++){
            System.out.println(20*i);
        }
        System.out.println(value);
    }

//    static int value = 20; // now i excess any methods

    static void main(){
//        System.out.println(value);
        System.out.println();
    }

}
