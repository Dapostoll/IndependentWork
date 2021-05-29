package twoDimensionalArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] array = new int[][] {
                {12,23,24,22},
                {24,52,12,42},
                {232,232,123,235}
        };
        System.out.println(array[2][2]);
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<4; j++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println(Arrays.deepToString(array));
    }
}
