package z_console_io;

public class g_console_add_nums {
    public static void main(String[] args) {
        System.out.println("Enter the first number : ");
        String stra = System.console().readLine();
        int a = Integer.parseInt(stra);
        System.out.println("Enter the second number : ");
        String strb = System.console().readLine();
        int b = Integer.parseInt(strb);
        System.out.println("The sum = " + (a+b));
    }
}
