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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        int pnode = len - n, curr = 0;
        temp = head;
        if(pnode==0){
          head = temp.next;  
          return head;
        }
        while(curr<=pnode){
            if(curr==pnode-1 && pnode+1==len){
                temp.next = null;
                return head;
            }
            if(curr==pnode-1) {
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
            curr++;
        }
        return head;
    }
}
