import java.util.Random;

public class Matrix {
    static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;
            }
        }
        return matrix;
    }
    static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
        System.out.println();
    }
    static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] trans = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }
    static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }
    static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }
    static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) {
            return null;
        }
     double[][] inv = new double[2][2];
     inv[0][0] =  m[1][1] / det;
     inv[0][1] = -m[0][1] / det;
     inv[1][0] = -m[1][0] / det;
     inv[1][1] =  m[0][0] / det;

        return inv;
    }
    static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) {
            return null;
        }
        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }
    public static void main(String[] args) {
        double[][] matrix2x2 = createRandomMatrix(2, 2);
        displayMatrix(matrix2x2);
        displayMatrix(transpose(matrix2x2));

        double det2 = determinant2x2(matrix2x2);
        System.out.println("Determinant = " + det2 + "\n");

        double[][] inv2 = inverse2x2(matrix2x2);
        if (inv2 != null) {
            displayMatrix(inv2);
        }
        double[][] matrix3x3 = createRandomMatrix(3, 3);
        displayMatrix(matrix3x3);
        displayMatrix(transpose(matrix3x3));

        double det3 = determinant3x3(matrix3x3);
        System.out.println("Determinant = " + det3 + "\n");
        double[][] inv3 = inverse3x3(matrix3x3);
        if (inv3 != null) {
            displayMatrix(inv3);
        }
    }
}
