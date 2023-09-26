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
    public int gcd(int a, int b){
        while(a>0){
            int t = a;
            a = b%a;
            b = t;
        }
        return b;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp.next!=null){
            int a = temp.val;
            int b = temp.next.val;
            ListNode newnode = new ListNode(gcd(a,b));
            newnode.next = temp.next;
            temp.next = newnode;
            temp = newnode.next;
        }
        return head;
    }
}
