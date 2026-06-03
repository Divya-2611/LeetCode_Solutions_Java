class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        int topRow = 0;
        int bottomRow = m - 1;
        int leftCol = 0;
        int rightCol = n - 1;
        int totalElements = 0;
        while (totalElements < m * n) {
            //     topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalElements < m * n; j++) {
                list.add(matrix[topRow][j]);
                totalElements++;
            }
            topRow++;
            //     rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < m * n; i++) {
                list.add(matrix[i][rightCol]);
                totalElements++;

            }
            rightCol--;
            //     bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElements < m * n; j--) {
                list.add(matrix[bottomRow][j]);
                 totalElements++;

            }
            bottomRow--;
            //     leftCol ->bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements < m * n; i--) {
                list.add(matrix[i][leftCol]);
                 totalElements++;

            }
            leftCol++;

        }
        return list;
    }
}