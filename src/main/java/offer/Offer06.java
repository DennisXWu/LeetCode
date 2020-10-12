package offer;

/**
 * Created by wxg on 2020/10/12.
 */

import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 *
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public class Offer06 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        System.out.println(reversePrint(head));
    }

    public static int[] reversePrint(ListNode head) {
        ListNode cur = head;
        Stack<Integer> stack = new Stack<>();

        while (cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        int[] array = new int[stack.size()];
        int i = 0;
        while (stack.size() != 0) {
            array[i++] = stack.pop();
        }
        return array;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
