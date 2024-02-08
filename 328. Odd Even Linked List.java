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
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        int f = 1;
        while(head!=null){
            if(f>0) arr.add(head.val);
            else arr1.add(head.val);
            head = head.next;
            f*=-1;
        }
        arr.addAll(arr1);
        ListNode t = new ListNode(0);
        ListNode h = t;
        for(int i : arr){
            t.next = new ListNode(i);
            t = t.next;
        }
        return h.next;
    }
}
