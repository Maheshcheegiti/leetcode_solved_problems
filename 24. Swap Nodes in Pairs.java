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
    public ListNode swapPairs(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        int c = 0;
        while(head!=null){
            if(c%2!=0) arr.add(c-1, head.val);
            else arr.add(head.val);
            head = head.next;
            c++;
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
