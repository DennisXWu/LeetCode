package offer;

/**
 * Created by wxg on 2021/1/5.
 */
public class Offer04 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        if (matrix.length == 0) {
            return false;
        }
        int rowIndex = 0;
        int colIndex = matrix[0].length - 1;

        while (rowIndex >= 0 && rowIndex < matrix.length && colIndex >= 0 && colIndex < matrix[0].length) {
            if (matrix[rowIndex][colIndex] == target) {
                return true;
            } else if (matrix[rowIndex][colIndex] > target) {
                colIndex--;
            } else {
                rowIndex++;
            }
        }
        return false;
    }
}
