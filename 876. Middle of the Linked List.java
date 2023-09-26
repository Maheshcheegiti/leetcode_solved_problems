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
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int c = 0;
        temp = head;
        while(c<length/2){
            temp = temp.next;
            c++;
        }
        return temp;
    }
}
