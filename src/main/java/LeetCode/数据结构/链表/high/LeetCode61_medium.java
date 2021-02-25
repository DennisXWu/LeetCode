package LeetCode.数据结构.链表.high;

/**
 * Created by wxg on 2021/2/25.
 */

/**
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 */
public class LeetCode61_medium {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        new LeetCode61_medium().rotateRight(node, 2);
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode index = new ListNode(0);
        index.next = head;
        int length = 0;
        while (index.next != null) {
            index = index.next;
            length++;
        }

        int num = k % length;
        if (num == 0) return head;

        index.next = head;
        for (int i = 0; i < length - num; i++) {
            index = index.next;
        }
        ListNode result = index.next;
        index.next = null;
        return result;
    }
}
