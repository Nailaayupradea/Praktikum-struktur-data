public class DiagonalMatriks {

    public static void main(String[] args) {
        int[][] matriks = {
            {2, 6, 4},
            {3, 5, 2},
            {9, 7, 6}
        };

        System.out.println("Diagonal Utama:");
        cetakDiagonalUtama(matriks);

        System.out.println("Diagonal Samping:");
        cetakDiagonalSamping(matriks);
    }

    public static void cetakDiagonalUtama(int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            System.out.print(matriks[i][i] + " ");
        }
        System.out.println();
    }

    public static void cetakDiagonalSamping(int[][] matriks) {
        int n = matriks.length;
        for (int i = 0; i < n; i++) {
            System.out.print(matriks[i][n - 1 - i] + " ");
        }
        System.out.println();
    }
}