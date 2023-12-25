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
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode t = addTwoNumbersHelper(l1, l2);
        t = reverse(t);
        return t;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null, curr = head, nxt = null;
        while(curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    public ListNode addTwoNumbersHelper(ListNode l1, ListNode l2) {
        int temp = 0;
        ListNode a = l1, b= l2, prev = null,sprev = null;
        while(a!=null && b!=null){
            temp = a.val + b.val + temp;
            a.val = temp%10;
            b.val = temp%10;
            temp /=10;
            prev = a;
            sprev = b;
            a = a.next;
            b = b.next;
        }
        if(a==null && b==null && temp > 0){
            ListNode newnode = new ListNode(temp);
            prev.next = newnode;
        }
        while(a!=null){
            temp = a.val+temp;
            a.val = temp%10;
            prev = a;
            a = a.next;
            temp /= 10;
        }
        if(a==null && temp > 0){
            ListNode newnode = new ListNode(temp);
            prev.next = newnode;
        }
        if(b!=null){
            while(b!=null){
                temp = b.val+temp;
                b.val = temp%10;
                sprev = b;
                b = b.next;
                temp /= 10;
            }
            if(b==null && temp > 0){
                ListNode newnode = new ListNode(temp);
                sprev.next = newnode;
            }
            return l2;
        }
        return l1;
    }
}
