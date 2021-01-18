package 剑指Offer;

/**
 * Created by wxg on 2020/10/12.
 */

import java.util.Stack;

/**
 * ����һ�������ͷ�ڵ㣬��β��ͷ����������ÿ���ڵ��ֵ�������鷵�أ���
 *
 *
 *
 * ʾ�� 1��
 *
 * ���룺head = [1,3,2]
 * �����[2,3,1]
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
