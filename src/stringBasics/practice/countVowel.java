package stringBasics.practice;

public class countVowel {

    static int getVowels(String str){

        int count = 0;
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch=='u' || ch == 'A' || ch == 'E' || ch =='I' || ch == 'O' || ch=='U') {
                count++;
            }
        }

        return count;

    }
    static void main(){

        String str = "Love";
        System.out.println(getVowels(str));

    }

}
