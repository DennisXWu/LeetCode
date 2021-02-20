package LeetCode.数据结构.链表.high;

/**
 * Created by wxg on 2021/1/24.
 */

/**
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class LeetCode203_easy {

    public static void main(String[] args) {
        LeetCode203_easy leetCode203 = new LeetCode203_easy();
        leetCode203.removeElements(leetCode203.construct(), 1);
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode first = new ListNode();
        first.next = head;

        ListNode pre = first;
        ListNode cur = head;
        ListNode next = head.next;

        while (cur != null) {
            if (cur.val == val) {
                pre.next = next;
            } else {
                pre = cur;
            }
            cur = cur.next;
            next = next == null ? null : next.next;
        }
        return first.next;
    }


    public ListNode construct() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
//        listNode.next.next = new ListNode(6);
//        listNode.next.next.next = new ListNode(3);
//        listNode.next.next.next.next = new ListNode(4);
//        listNode.next.next.next.next.next = new ListNode(5);
//        listNode.next.next.next.next.
// next.next = new ListNode(6);
        return listNode;
    }

    public class ListNode {
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
