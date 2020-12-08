package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxg on 2020/12/8.
 */
public class Offer20 {
    //快慢指针
    public ListNode getKthFromEnd2(ListNode head, int k) {

        if (head == null || k == 0) {
            return head;
        }
        ListNode front = head;
        ListNode behind = head;

        for (int i = 1; i < k; i++) {
            if (front == null) {
                return null;
            }
            front = front.next;
        }

        while (front.next != null) {
            front = front.next;
            behind = behind.next;
        }

        return behind;
    }

    //
    public ListNode getKthFromEnd(ListNode head, int k) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            nodes.add(curr);
            curr = curr.next;
        }
        if ((nodes.size() - k) <= 0) {
            return head;
        }
        return nodes.get(nodes.size() - k);
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
