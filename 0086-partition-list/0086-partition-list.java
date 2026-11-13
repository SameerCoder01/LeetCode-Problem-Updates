/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {

        ListNode df = new ListNode(-1);
        ListNode ds = new ListNode(-1);

        ListNode first = df;
        ListNode second = ds;

        ListNode temp = head;

        while(temp != null){
            ListNode t = new ListNode(temp.val);

            if(temp.val < x){
                first.next = t;
                first = t;
            }else{
                second.next = t;
                second = t;
            }
            temp = temp.next;
        }

        first.next = ds.next;
        return df.next;
    }
}