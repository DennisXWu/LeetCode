package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxg on 2020/12/13.
 */
public class Offer33 {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 5, 10, 6, 9, 4, 3};
        System.out.println(verifyPostorder(array));
    }

    public static boolean verifyPostorder(int[] postorder) {
        if (postorder.length == 0) {
            return true;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < postorder.length; i++) {
            list.add(postorder[i]);
        }
        return solve(list);
    }

    private static boolean solve(List<Integer> list) {
        if (list.size() < 1) {
            return true;
        }
        Integer root = list.get(list.size() - 1);

        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        int i = 0;

        while (list.get(i) < root) {
            leftList.add(list.get(i++));
        }
        while (list.get(i) > root) {
            rightList.add(list.get(i++));
        }

        if ((rightList.size() + leftList.size()) != list.size() - 1) {
            return false;
        }
        return solve(rightList) && solve(leftList);
    }
}
