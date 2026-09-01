package OOPs.encapsulation;

public class classNames {

    public static void main(String[] args) throws Exception{

        //Encapsulation

//        Students A = new Students(1, 12, "Rahul", 3, "Teena");
//
//        System.out.println(A.id);
//        System.out.println(A.age);
//        System.out.println(A.name);
//        System.out.println(A.nos);
////        System.out.println(A.gf); // error
//
//        A.bunk();
//        A.sleep();
//        A.study();
////        A.gfChatting(); // error


        // Perfect Encapsulation


        PerfectEncapsulation A = new PerfectEncapsulation(1, 12, "Rahul", 3, "Teena");

//        System.out.println(A.name); //error
        System.out.println(A.getName());

//        System.out.println(A.age); //error
        System.out.println(A.getAge()); //error

        A.setAge(67);


        A.bunk();
        A.sleep();
        A.study();


    }

}
