/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while( a!= null){
            if(a== null){
                a= headB;
            }else{
                a=a.next;
            }
        }if(b!= null){
            b= b.next;
        }
        return a;
        
    }
}