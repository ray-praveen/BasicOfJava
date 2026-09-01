package stringBasics.practice;

public class charString {

    static void printString(String str){
        int n = str.length();
        for (int i=0; i<n; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static void main(){

        String str = "LOVE";
        printString(str);


    }

}
