package offer;

/**
 * Created by wxg on 2020/12/1.
 */

/**
 * �����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����·�����ԴӾ����е�����һ��ʼ��ÿһ�������ھ����������ҡ��ϡ����ƶ�һ�����һ��·�������˾����ĳһ����ô��·�������ٴν���ø��ӡ����磬�������3��4�ľ����а���һ���ַ�����bfce����·����·���е���ĸ�üӴֱ������
 *
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 *
 * �������в������ַ�����abfb����·������Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��·�������ٴν���������ӡ�
 *
 * ʾ�� 1��
 *
 * ���룺board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * �����true
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
