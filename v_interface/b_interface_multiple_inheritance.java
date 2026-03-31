package v_interface;

interface Teacher {
    public void teach();
}

interface Student {
    public void learn();
}

class College implements Teacher, Student {
    @Override
    public void teach() {
        System.out.println("Teacher is teaching....");
    }

    @Override
    public void learn() {
        System.out.println("Student is learning....");
    }
}

public class b_interface_multiple_inheritance {
    public static void main(String[] args) {
        College sanothimi = new College();
        sanothimi.teach();
        sanothimi.learn();
    }
}