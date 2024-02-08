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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode head1 = head;
        while(head!=null){
            int c = head.val;
            map.put(c, map.getOrDefault(c, 0)+1);
            head = head.next;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        while(head1!=null){
            int c = head1.val;
            if(map.get(c)==1) arr.add(c);
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
