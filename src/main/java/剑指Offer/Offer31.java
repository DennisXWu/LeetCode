package 剑指Offer;

import java.util.Stack;

/**
 * Created by wxg on 2020/12/9.
 */
public class Offer31 {
    public static void main(String[] args) {
        int[] push = {2, 1, 0};
        int[] pop = {1, 2, 0};
        System.out.println(new Offer31().validateStackSequences(push, pop));
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> pop = new Stack<>();
        Stack<Integer> push = new Stack<>();
        for (int i = popped.length - 1; i >= 0; i--) {
            pop.push(popped[i]);
        }

        for (int j = 0; j < pushed.length; j++) {
            push.push(pushed[j]);
            while (!pop.isEmpty() && !push.isEmpty() && pop.peek().equals(push.peek())) {
                push.pop();
                pop.pop();
            }
        }

        if (push.equals(pop)) {
            return true;
        }
        return false;
    }
}
