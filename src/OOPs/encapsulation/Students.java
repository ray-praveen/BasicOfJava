package OOPs.encapsulation;

public class Students {

    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;

    public Students(int id, int age, String name,int nos, String gf){

        System.out.println("Student Parameterised ctor called");

        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;

    }

    public void study(){
        System.out.println(name + " Studying");
    }

    public void sleep(){
        System.out.println(name + " Sleeping");
    }

    public void bunk(){
        System.out.println(name + " Bunking");
    }

    private void gfChatting(){
        System.out.println(name + " gfChatting");
    }

}
