package g_type_conversion;

public class c_int_to_string {
    public static void main(String[] args) {
        int num = 32;
        String numStr = String.valueOf(num);
        System.out.println("The integer = " +num);
        System.out.println("The converted string = " + numStr);
        System.out.println(numStr.getClass().getSimpleName());
    }
}
