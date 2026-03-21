package f_data_types;

public class o_array_single_indexed {
    public static void main(String[] args) {
        int stuMarks[];
        stuMarks = new int[5];
       /*  int stuMarks = new int [5];
        int [] stuMarks = { 10,55,0,32,52}; */
        stuMarks[0] = 60;
        stuMarks[1] = 40;
        stuMarks[2] = 70;
        stuMarks[3] = 80;
        stuMarks[4] = 10;
        System.out.println(stuMarks[2]); //70
        System.out.println(stuMarks[20]); //error
    }
}
