package OOPs.encapsulation;

public class PerfectEncapsulation {

    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int a){

        //extra layer of Authentication

        if (age < 100)
            this.age= a;
        return;

    }

    public PerfectEncapsulation(int id, int age, String name, int nos, String gf){

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
