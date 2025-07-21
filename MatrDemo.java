public class MatrDemo {
    public static void main(String[] args) {
        float[][] data = {
            {1.5f, -2.0f, 3.0f},
            {4.0f, 5.5f, -6.0f},
            {7.0f, 8.0f, 9.5f}
        };

        IntellectMatr matr = new IntellectMatr(data);

        System.out.println("Исходная матрица:");
        matr.printMatrix();

        System.out.println("\nСумма главной диагонали: " + matr.sumMainDiagonal());

        System.out.println("\nТранспонированная матрица:");
        float[][] trans = matr.transpose();
        for (float[] row : trans) {
            for (float val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }

        System.out.println("\nКоличество отрицательных элементов в каждой строке:");
        int[] negs = matr.countNegativesPerRow();
        printArray(negs);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

