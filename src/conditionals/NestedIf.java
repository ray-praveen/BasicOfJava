package conditionals;

public class NestedIf {
    static void main(){

        int age = 12;
        char gender = 'M';

        if(gender == 'M'){
            System.out.println("Male");
            if (age > 18){
                System.out.println("Yes");

            }else {
                System.out.println("No");
            }
        }else {
            System.out.println(" NO male");
            if (age > 18){
                System.out.println("Yes");

            }else {
                System.out.println("No");
            }
        }

    }
}
