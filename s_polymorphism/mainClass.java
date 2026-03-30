package s_polymorphism;

class Person {
    void role()
    {
        System.out.println("I am a Person. ");
    }
}

class Father extends Person {
    @Override
    void role()
    {
        System.out.println("I am a Father. ");
    }
}


public class mainClass {
    public static void main(String[] args) {
        Person p1 = new Father();
        p1.role();
    }
}