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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head.next == null){
            return head;
        }

        ListNode t = head;
        int size = 0;

        while(t != null){
            size++;
            t = t.next;
        }

        ListNode temp = head;

        ListNode last = null;

        int iteration = 1;

        while(temp != null){
            

            if(k > size){
                while(temp != null){
                    ListNode tempo = new ListNode(temp.val);
                    last.next = tempo;
                    last = tempo;
                    temp = temp.next;
                    size--;
                }

            }else{
                ListNode dummy = new ListNode(-1);
                ListNode curr = null;
                ListNode newcurr = dummy;
                ListNode currlast = dummy;

                int count = 1;
                int currcount = 1;

                for(int i=1; i<=k; i++){
                    ListNode tempo = new ListNode(temp.val);
                                      
                    tempo.next = curr;
                    curr = tempo;
                    newcurr.next = tempo;
                    
                    if(count == 1 && iteration == 1){
                        
                        last = tempo;
                        count--;
                    }
                    if(currcount == 1 && iteration > 1){
                        currlast = tempo;
                        currcount--;
                    }
                    

                    temp = temp.next;
                    size--;
                }
                if(iteration > 1){
                    last.next = dummy.next;
                    last = currlast;
                }
                if(iteration == 1){
                    head = newcurr.next;
                }
                iteration++;
            }
            
        }

        return head;


        
    }
}