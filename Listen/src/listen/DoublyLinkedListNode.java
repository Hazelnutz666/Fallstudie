
package listen;

/**
 *
 * @author Hagen1
 */
public class DoublyLinkedListNode {
    private String entry;
    private DoublyLinkedListNode next;
    private DoublyLinkedListNode prev;
public DoublyLinkedListNode(String value, DoublyLinkedListNode prevNode) {
    this.entry = value; this.prev = prevNode; this.next = null; 
}
public DoublyLinkedListNode getNext() {
    return next;
}
public void setNext(DoublyLinkedListNode nextNode) {
    this.next = nextNode; 
}
public String getEntry() {
    return entry; 
}
}
