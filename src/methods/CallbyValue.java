package methods;

public class CallbyValue {

    static void solve(int num){
        System.out.println("inside solve: "+ num);
        num = num * 10;
        System.out.println("inside solve: " + num);
    }

    static void main(){
        int num = 5;
        System.out.println("inside: " + num);
        solve(num);
        System.out.println("inside: " + num);
    }

}
