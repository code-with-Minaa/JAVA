package k_variable_constant;

class College {
    final int college_id = 27;

    void display() {
        System.out.println("College ID = " + college_id);
    }
}

public class b_constant_final {
    public static void main(String[] args) {
        College stc = new College();
        stc.display();
    }
}