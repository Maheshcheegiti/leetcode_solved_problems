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
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        while(head!=null){
            if(head.val<x) arr1.add(head.val);
            else arr2.add(head.val);
            head= head.next;
        }
        
        arr1.addAll(arr2);
        
        ListNode head2 = new ListNode(0);
        ListNode tmp = head2;
        for(Integer i : arr1){
            head2.next = new ListNode(i);
            head2 = head2.next;
        }
        return tmp.next;
    }
}
