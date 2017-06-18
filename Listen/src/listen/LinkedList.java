 
package listen;
 


public class LinkedList {
private ListNode head;
public LinkedList() {
    this.head = null;
}
public void add(int value) {
ListNode newNode = new ListNode(value, this.head);
this.head = newNode; 
}

  
    
// Einträge der Listenknoten ausgeben- Rekursiv
    public void printList() { 
        printList(this.head); 
    }
private void printList(ListNode node) {
    if (node == null) { return; 
    }
    print(); System.out.print(" "); printList(node.getNext()); 
}

//35.2-1  - Gebe Eintrag aus
    public void print() {
    System.out.print(this.entry);
}


//35.2-2 Ermiitteln der LÄnge der Liste - Rekursiv
    public int size() {
        int count = 0; 
        for (ListNode current = this.head;
                current != null;
                current = current.getNext()) { 
            count++; 
        } return count; 
    }


// 35.2-4 - Liefere Summe der Lsiteneinträge- interativ
       
    public int sumIterative() { 
        ListNode current = this.head; int sumIterative = 0; while (current != null) { 
            sumIterative += current.getEntry(); current = current.getNext(); 
        } 
        return sumIterative; 
    }

    // 35.2-5 -aufsummieren der Listenknoten- rekursive
    public int sumRecursive() {
        return sumRecursive(this.head); 
    }
private int sumRecursive(ListNode node) {
    if (node == null) {
        return 0; 
}
return node.getEntry() + sumRecursive(node.getNext()); 
}
    
  // 35.2-6  Liste rückwärtig ausgeben - rekursiv
    public void printReverseList() { 
        printReverseList(this.head); 
    }
private void printReverseList(ListNode node) {
    if (node == null) 
    { return; 
    }
    printReverseList(node.getNext());
    print(); System.out.print(" "); 
}

   // Value in Liste finden und entfernen!- Rekursiv
public void remove(int value) { 
    this.head = remove(this.head, value);
} 

private ListNode remove(ListNode node, int value) { 
 if (node == null) {
 return null; 
}
if (node.getEntry() == value) {
return node.getNext();
}
node.setNext(remove(node.getNext(), value)); 
return node;
}



// 35.2-8 Prüfen von bestimmten Wert in einer Liste- Rekursiv
  public boolean contains(int value) {
        return contains(this.head, value); 
    }
private boolean contains(ListNode node, int value) { if (node == null) { return false; 
} 
if (node.getEntry() == value) {
    return true; 
}
return contains(node.getNext(), value); 
}


// 35.2-10 Iterativ Wert an bestimmter Position prüfen und holen
    public int getListIterative(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException( "ungültiger index"); 
        }
        ListNode current = this.head; 
        for (int i = 0; i < index; i++) 
        {
            current = current.getNext(); 
        } 
        return current.getEntry(); }

    // 35.2-10 Rekursiv Wert an bestimmter Position abrufen (ohne zu verändern)
    public int getListRecursive(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException( "ungültiger index"); 
        }
        return getListRecursive(this.head, index).getEntry(); 
    }
private ListNode getListRecursive(ListNode node, int steps) {
    if (steps == 0) { return node; 
    } 
    return getListRecursive(node.getNext(), steps - 1); 
}

    

    // 35.2-11- Liste leeren
    public void clear (){
    this.head = null;
}
    // 35.2-12  Prüfen ob Liste leer ist
  public boolean isEmpty (){
    return (size()==0);
}
 
  
  //35.2.13 - Teilliste zurückliefern
  //Teilliste enthält alle Einträge zwischen fromIndex und to Index
  public LinkedList subList(int fromIndex, int toIndex) { 
      if (fromIndex < 0 || toIndex > size() || fromIndex > toIndex) {
          throw new IndexOutOfBoundsException( "ungültiger index"); 
      } LinkedList list = new LinkedList(); 
      list.head = subList(this.head, fromIndex, toIndex - fromIndex); return list; 
  }
private ListNode subList(ListNode node, int steps, int size) { if (size == 0) {
    return null; } 
if (steps == 0)
{ ListNode subListNode = new ListNode(node.getEntry());
subListNode.setNext(subList(node.getNext(), 0, size - 1)); 
return subListNode; } return subList(node.getNext(), steps - 1, size); 
}

  
  //Merge Sort: Unssortierte Liste in sortierte Liste überführen
public LinkedList mergeSort() {
      int length = this.size(); 
      if (length <= 1) { 
          return this; 
      } 
      LinkedList leftSorted = this.subList(0, length / 2).mergeSort(); 
      LinkedList rightSorted = this.subList(length / 2, length).mergeSort();
      leftSorted.mergeWith(rightSorted); 
      return leftSorted;
  }
private void mergeWith(LinkedList otherList) {
    if (otherList.isEmpty()) 
    {
        return; 
    }
    if (this.isEmpty()) 
    {
     this.head = otherList.head; return; 
    }
 if (otherList.head.getEntry() <= this.head.getEntry()) {
     int first = otherList.removeFirst();
     this.mergeWith(otherList);
     this.add(first); return; 
 }
 int first = this.removeFirst(); 
 otherList.mergeWith(this); otherList.add(first); this.head = otherList.head;
}
private int removeFirst() {
    if (this.head == null) {
        throw new IndexOutOfBoundsException("leere Liste"); 
    }
    int first = this.head.getEntry(); 
    this.head = this.head.getNext(); 
    return first; 
}


// 35.2.3 MIt Add - EInfügen vonEInträgen einer nicht leeren Liste    
public static void main(String[] args) {
      
    
LinkedList liste = new LinkedList(); 
liste.add(1);
liste.add(2); 
liste.add(4); 
liste.add(4); 
liste.add(6); 
liste.add(8); 
System.out.println("Listsize is" + liste.size());
    }
    
}
