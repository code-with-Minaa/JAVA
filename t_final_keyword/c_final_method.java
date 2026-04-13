      package t_final_keyword;

class Dad {
    // overridden method
    // final void cooking() {
    void cooking() {
        System.out.println("Dad is Cooking.");
    }
}

class Daughter extends Dad {
    @Override
    // overriding method
    void cooking() {
        System.out.println("Daughter is Cooking.");
    }
}
public class c_final_method {
    public static void main(String[] args) {
        Daughter g = new Daughter();
        g.cooking();
    }
}