package f_data_types;

public class t_array_two_dim_position {
    public static void main(String[] args) {
        /* int [][] myArray = new int [][]
        {
            {20, 55, 65, 50, 32},
            {20, 10, 98, 11, 45}
        };
       
        for(int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.println(myArray[i][j]);
            }
        } */

        int pos[][] = new int [4][5];
        int k = 0;
        for (int i = 0; i<4; i++){
            for (int j = 0; j<5; j++) {
                pos[i][j] = k;
                k++;
            }
        }
         for (int i = 0; i<4; i++){
            for (int j = 0; j<5; j++) {
                System.out.println(pos[i][j] + " ");
            }   
         }  
         System.out.println();   
    }
}
