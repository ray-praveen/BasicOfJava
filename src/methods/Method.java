package methods;

public class Method { // static

    //declaration/definition
    static void print2Table(){
        for (int i=0; i<10;i++){
            int ans = 2 * i;
            System.out.println("-> " + ans);
        }
    }

    static void main(){ //static
        System.out.println("Hii");
        print2Table(); //call function
        System.out.println("bye");
    }

}
