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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();

        ListNode t1 = l1;
        ListNode t2 = l2;

        while(t1 != null){
            stack1.push(t1.val);
            t1 = t1.next;
        }

        while(t2 != null){
            stack2.push(t2.val);
            t2 = t2.next;
        }

        int ans = 0;
        int carry = 0;

        ListNode dummy = new ListNode(-1);
        ListNode curr = null;

        while(!stack1.isEmpty() || !stack2.isEmpty()){
            
            int sum = carry;            

            if(!stack1.isEmpty()){
                sum += stack1.peek();
                stack1.pop();
            }
            
            if(!stack2.isEmpty()){
                sum += stack2.peek();
                stack2.pop();
            }

            ListNode temp = new ListNode(sum % 10);
            carry = sum/10;
            
            temp.next = curr;
            dummy.next = temp;
            curr = temp;

        }

        if(carry != 0){
            ListNode temp = new ListNode(carry);
            temp.next = curr;
            dummy.next = temp;
        }

        return dummy.next;
    }
}