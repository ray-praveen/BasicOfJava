package stringBasics.practice;

public class ReverseString {

    static String reverseStr(String str){

        String rev = "";

        for (int i = str.length()-1; i>=0;i--){
            char ch = str.charAt(i);
            rev = rev + ch;
        }
        return rev;

    }

    static void main(){

        String str = "LOVE";
        System.out.println(reverseStr(str));

    }

}
