package offer;

import java.util.Stack;

/**
 * Created by wxg on 2020/12/6.
 */
public class Offer24 {
    //头插法
    public ListNode reverseList2(ListNode head) {

        ListNode pre = null;
        ListNode curr = head;

        while (curr != null) {
            //1、暂存
            ListNode tmp = curr.next;

            //2、指向
            curr.next = pre;

            //3、归位(先pre 后curr)
            pre = curr;
            curr = tmp;
        }
        return pre;
    }

    public ListNode recReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newNode = recReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }


    // 栈
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        if (head == null) {
            return head;
        }
        ListNode current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        ListNode pop = stack.pop();
        ListNode newHead = new ListNode(pop.val);
        ListNode newCur = newHead;
        while (!stack.isEmpty()) {
            ListNode stackNode = stack.pop();
            newCur.next = new ListNode(stackNode.val);
            newCur = newCur.next;
        }
        return newHead;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
