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
    public void reorderList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ListNode t = head;
        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }
        int i;
        for(i = 0; i<arr.size()/2; i++){
            arr1.add(arr.get(i));
            arr1.add(arr.get(arr.size()-i-1));
        }
        if(arr.size()%2==1) arr1.add(arr.get(i));
        int c = 0;
        while(t!=null){
            t.val  = arr1.get(c);
            t = t.next;
            c++;
        }
        
    }
}
