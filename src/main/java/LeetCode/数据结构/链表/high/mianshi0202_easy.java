package LeetCode.数据结构.链表.high;

/**
 * Created by wxg on 2021/2/22.
 */

/**
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 *
 * 注意：本题相对原题稍作改动
 *
 * 示例：
 *
 * 输入： 1->2->3->4->5 和 k = 2
 * 输出： 4
 */
public class mianshi0202_easy {

    //快慢指针
    public int kthToLast2(ListNode head, int k) {
        if (head == null) return 0;
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    }

    public int kthToLast(ListNode head, int k) {
        if (head == null) return 0;
        ListNode rev = reverse(head);
        for (int i = 0; i < k - 1; i++) {
            rev = rev.next;
        }
        return rev.val;
    }

    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = head.next;

        while (cur != null) {
            cur.next = pre;

            pre = cur;
            cur = next;
            next = cur == null ? null : cur.next;
        }
        return pre;
    }
}
