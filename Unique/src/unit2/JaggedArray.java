 package unit2;

public class JaggedArray {
    public static void main(String args[]) {
        // declare 2D array with 3 rows
        int array[][] = new int[3][];
        array[0] = new int[]{1, 2, 3};
        array[1] = new int[]{4, 5};
        array[2] = new int[]{6, 7, 8, 9};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
