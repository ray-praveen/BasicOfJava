package stringBasics.practice;

public class checkPalindrome {

    static String reverseStr(String str){

        String rev = "";

        for (int i = str.length()-1; i>=0;i--){
            char ch = str.charAt(i);
            rev = rev + ch;
        }
        return rev;

    }

    static boolean isPalindrome(String str){

        String org = str;
        String rev = reverseStr(org);

        //compare

        for (int i=0; i<org.length(); i++){
            char ch1 = org.charAt(i);
            char ch2 = rev.charAt(i);
                if (ch1 != ch2) {
                    // no match
                    return false;
                }

        }

        return true;


    }

    static void main(){

        String str = "BooN";
        System.out.println(isPalindrome(str));

    }

}
