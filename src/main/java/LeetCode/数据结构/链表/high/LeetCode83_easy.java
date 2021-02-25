package LeetCode.数据结构.链表.high;

/**
 * Created by wxg on 2021/2/25.
 */

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 */
public class LeetCode83_easy {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = head;
        ListNode cur = head;

        while (cur != null) {
            if (pre.val == cur.val) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
