/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseBetween(int a, int b, Node head) {
        
                if (head == null || a == b) {
                    return head;
                }

                
                Node dummy = new Node(0);
                dummy.next = head;
                Node prev = dummy;
                for (int i = 1; i < a; i++) {
                    prev = prev.next;
                }

                
                Node curr = prev.next;
                Node next = null;

                
                for (int i = 0; i < b - a; i++) {
                    next = curr.next;
                    curr.next = next.next;
                    next.next = prev.next;
                    prev.next = next;
                }

                return dummy.next;
            }
        }
        
        
    
