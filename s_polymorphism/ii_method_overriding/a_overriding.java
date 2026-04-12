package s_polymorphism.ii_method_overriding;

class Dad {
    // overridden method
    void cooking() {
        System.out.println("Dad is preparing meal.");
    }
}

class Daughter extends Dad {
    @Override
    // overriding method
    void cooking() {
        System.out.println("Daughter is preparing meal.");
    }
}

public class a_overriding {
    public static void main(String[] args) {
        Daughter daughter = new Daughter();
        daughter.cooking();
    }
}