package OOPs.basic;

public class className {

    public static void main(String[] args) throws Exception{

//        className A = new className();
//        A.id = 1;
//        A.age = 24;
//        A.name = "Rahul";
//        A.nos = 5;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.study();
//        A.sleep();

        //parameterised ctor
        Student A = new Student(1, 12, "Rahul", 3);

//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.study();
//        A.sleep();
//
//        int a= 6;
//        int b = a;

        //copy constructor

//        Student B = new Student(A);
//
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.id);
//        System.out.println(B.nos);
//
//        B.bunk();
//        B.study();
//        B.sleep();

        // object lifecycle

        Student C = new Student(1, 12, "Rahul", 3);
        Student D = new Student(1, 12, "Rahul", 3);
        Student E = new Student(1, 12, "Rahul", 3);


    }

}
