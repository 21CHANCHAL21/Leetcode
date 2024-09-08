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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        ListNode ans[] = new ListNode[k];
        System.out.println(k);
        
        if(head == null)return ans;
        int i =0;
        ListNode c = head;
        if(size <= k){
            while(c!= null){
               
                ans[i++] = c;
                ListNode p = c.next;
                c.next = null;
                c = p;

            }
            
        }
        
        else{
            int rem = size %k;
            int q = size / k;
            while(c != null && i<k){
                ans[i++] = c;
                int s = 1;
                int r = rem>0?1:0;
                while(s < q + r && c != null){
                    s++;
                    c = c.next;
                }
                if(c == null)break;
                if(rem>0)rem--;
                ListNode p = c.next;
                c.next = null;
                c = p;
            

            }
        }
        return ans;
       
        
    }
}