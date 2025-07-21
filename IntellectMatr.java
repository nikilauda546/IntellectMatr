public class IntellectMatr {
    public float[][] matrix;

    public IntellectMatr(float[][] matrix) {
        this.matrix = matrix;
    }

    public void printMatrix() {
        for (float[] row : matrix) {
            for (float val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public float sumMainDiagonal() {
        float sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public float[][] transpose() {
        int rows = matrix.length;
        int cols = matrix[0].length;
        float[][] transposed = new float[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        return transposed;
    }

    public int[] countNegativesPerRow() {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (float val : matrix[i]) {
                if (val < 0) count++;
            }
            result[i] = count;
        }
        return result;
    }
}

