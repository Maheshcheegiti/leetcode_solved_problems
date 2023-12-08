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
    public ListNode rotateRight(ListNode head, int k) {
        int l=0;
        ListNode ltemp = head;
        ListNode temp2 = head;
        while(temp2!=null){
            l++;
            ltemp= temp2;
            temp2 = temp2.next;
        }
        if(l==0) return head;
        k=k%l;
        if(k==0) return head;
        int t = 0;
        ListNode temp = head;
        while(t!=l-k-1 && temp.next!=null){
            temp = temp.next;
            t++;
        }
        System.out.println(temp.val);
        ListNode ntemp = temp.next;
        temp.next = null;
        ltemp.next = head;
        head = ntemp;
        return head;
    }
}
