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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode head1 = head;
        int c = 0;
        while(head!=null){
            c++;
            if(c>=left && c<=right) arr.add(head.val);
            head = head.next;
            if(c>right) break; 
        }
        Collections.reverse(arr);
        c = 0;
        while(head1!=null){
            c++;
            if(c<left) arr.add(c-1, head1.val);
            if(c>right) arr.add(head1.val);
            head1 = head1.next;
        }
        ListNode t = new ListNode(0);
        ListNode h = t;
        for(int i : arr){
            t.next = new ListNode(i);
            t = t.next;
        }
        return h.next;
    }
}
