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
    public int[] nextLargerNodes(ListNode head) {
        int l = 0;
        ListNode temp = head;
        while(head!=null){
            l++;
            head = head.next;
        }
        head = temp;
        int[] arr = new int[l];
        int ind = 0;
        while(head!=null){
            arr[ind++] = head.val;
            head = head.next;
        }
        Stack<Integer> st = new Stack<>();
        st.push(arr[l-1]);
        arr[l-1] = 0;
        for(int i = l-2; i>=0; i--){
            int t = arr[i];
            while(!st.isEmpty() && st.peek()<=t){
             st.pop();   
            }
            if(st.isEmpty()) arr[i] = 0;
            else arr[i] = st.peek();
            st.push(t);
        }
        return arr;
    }
}
