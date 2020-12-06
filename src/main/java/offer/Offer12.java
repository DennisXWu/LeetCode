package offer;

/**
 * Created by wxg on 2020/12/1.
 */

/**
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
 *
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 *
 * 但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。
 *
 * 示例 1：
 *
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * 输出：true
 */
public class Offer12 {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        Offer12 offer12 = new Offer12();
        boolean exist = offer12.exist(board, word);
        System.out.println(exist);
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] vis = new boolean[board.length][board[0].length];
        for (int row = 0; row < board.length; row++) {
            for (int clo = 0; clo < board[0].length; clo++) {
                if (solve(board, row, clo, vis, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean solve(char[][] board, int row, int clo, boolean[][] vis, String word, int index) {
        if (row < 0 || row >= board.length || clo < 0 || clo >= board[0].length || vis[row][clo]) {
            return false;
        }

        if (word.charAt(index) != board[row][clo]) {
            return false;
        }

        if (index == word.length() - 1) {
            return true;
        }
        vis[row][clo] = true;

        boolean flag = solve(board, row + 1, clo, vis, word, index + 1) || solve(board, row - 1, clo, vis, word, index + 1) || solve(board, row, clo + 1, vis, word, index + 1) || solve(board, row, clo - 1, vis, word, index + 1);

        vis[row][clo] = false;

        return flag;
    }
}
