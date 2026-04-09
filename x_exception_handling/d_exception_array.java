package x_exception_handling;

public class d_exception_array {
    public static void main(String[] args) {
        int[] nums = { 10,20,30,40,50 };
        try {
            for (int i = 0; i <= nums.length; i++) {
                System.out.println(nums[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception Handled :" + e);
        }
    }
}