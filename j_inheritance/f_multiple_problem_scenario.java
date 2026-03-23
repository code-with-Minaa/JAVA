package j_inheritance;

class Dad{
    void hi()
    {
        System.out.println("Hi Child");
    }
}

class Mom{
    void hello()
    {
        System.out.println("Hello Child");
    }
}

// class Son extends Dad, Mom{ // multiple inheritance is not supported in java
//     void greetings()
class Son extends Dad{
    void greetings(){
        System.out.println("Namaste ! my parents");
    }
}

public class f_multiple_problem_scenario {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.greetings();
        // s1.hi();
        // s1.hello();
    }
}