package OOPs.basic;


public class Student {

//     Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

//     default ctor // attr. -> garbage

    public void Student(){
        System.out.println("Student Default ctor Called");
    }



    // parameterized ctor
    public Student(int id, int age, String name, int nos){
        System.out.println("Student Default ctor Called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // Copy parameterized ctor
    public Student(Student srcobj){ // srcobj -> A
        System.out.println("Student Default ctor Called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }

    // Method / behaviors/ function
    public void study(){
        System.out.println(name + " Studying");
    }
    public void sleep(){
        System.out.println(name + " Sleeping");
    }

    public void bunk(){
        System.out.println(name + " Bunking");
    }


}