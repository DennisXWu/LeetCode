package LeetCode.数据结构.链表.high;

/**
 * Created by wxg on 2021/2/20.
 */

/**
 * 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 示例 1:
 *
 * 给定链表 1->2->3->4, 重新排列为 1->4->2->3.
 */
public class LeetCode143_medium {
    public static void main(String[] args) {
        LeetCode143_medium leetCode143_medium = new LeetCode143_medium();
        leetCode143_medium.reorderList(new ListNode(1));
    }

    public void reorderList(ListNode head) {
        if (head == null) return;
        ListNode mid = findMid(head);

        ListNode head2 = mid.next;
        mid.next = null;
        head2 = reverse(head2);
        merge(head, head2);
    }

    public void merge(ListNode head1, ListNode head2) {
        ListNode next1;
        ListNode next2;
        while (head1 != null && head2 != null) {
            next1 = head1.next;
            next2 = head2.next;


            head1.next = head2;
            head2.next = next1;

            head1 = next1;
            head2 = next2;
        }
    }

    public ListNode findMid(ListNode node) {
        ListNode fast = node;
        ListNode slow = node;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public ListNode reverse(ListNode node) {
        if (node == null) return node;
        ListNode pre = null;
        ListNode cur = node;
        ListNode next = cur.next;
        while (cur != null) {
            cur.next = pre;

            pre = cur;
            cur = next;
            next = cur == null ? null : cur.next;
        }
        return pre;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
