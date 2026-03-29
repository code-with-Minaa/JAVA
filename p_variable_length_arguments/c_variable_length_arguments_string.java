package p_variable_length_arguments;

public class c_variable_length_arguments_string {
    // public void displayNames(String... strs){
    public static void displayNames(String... strs){
        System.out.println("The number of arguments passed : " + strs.length);
        System.out.print("The values are : ");
        for (String name : strs) {
            System.out.print(name + "");
        }
    }
    public static void main(String[] args) {
        displayNames();
        displayNames("Mina");
        displayNames("Deep", "Dibya");
        displayNames("","Gita","Nita");
        displayNames("Fulmati","Ritumati", "Saraswati", "Harikala");
        displayNames("Rose", "Katherine", "Bellie");
    }
}