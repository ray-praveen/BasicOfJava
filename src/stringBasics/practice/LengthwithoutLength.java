package stringBasics.practice;

public class LengthwithoutLength {

    static int printLength(String str){

        int count = 0;
//        for (char ch: str){
//            count++;
//        }         //error

        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;

    }
    static void main(){

        String str = "LOVE";
        System.out.println(printLength(str));

    }

}
