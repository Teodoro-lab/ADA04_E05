package doublylink;

public class DoublyLinkedList<T> {

    private DoublyLink<T> first; 
    private DoublyLink<T> last; 
    
    public DoublyLinkedList() {
        first = null; 
        last = null;
    }

    public boolean isEmpty() { 
        return first==null; 
    }
    
    public void insertFirst(long dd){
        DoublyLink<T> newLink = new DoublyLink<T>(dd); 
        if( isEmpty() ) 
            last = newLink; 
        else
            first.previous = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long dd) {
        DoublyLink<T> newLink = new DoublyLink<T>(dd); 
        if( isEmpty() ) 
            first = newLink; 
        else {
            last.next = newLink; 
            newLink.previous = last; 
        }
        last = newLink; 
    }

    public DoublyLink<T> deleteFirst() { 
        DoublyLink<T> temp = first;
        if(first.next == null) 
            last = null;
        else
            first.next.previous = null;
        first = first.next; 
        return temp;
    }

    public DoublyLink<T> deleteLast(){
        DoublyLink temp = last;
        if(first.next == null) 
            first = null; 
        else
            last.previous.next = null; 
        last = last.previous; 
        return temp;
    }
    
    public boolean insertAfter(long key, long dd) { 
        DoublyLink current = first; 
        while(current.dData != key) {
            current = current.next; 
            if(current == null)
                return false; 
        }
        DoublyLink newLink = new DoublyLink(dd);
        if(current==last) {
            newLink.next = null; 
            last = newLink;
        }
        else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current; 
        current.next = newLink; 
        return true; 
    }
    
    public DoublyLink deleteKey(long key) { 
        DoublyLink current = first; 
        while(current.dData != key) {
            current = current.next; 
            if(current == null)
            return null;
        }
        if(current==first)
            first = current.next;
        else
            current.previous.next = current.next;
        if(current==last) 
            last = current.previous;
        else
            current.next.previous = current.previous;
        return current;
    }

    public void displayForward() {
        System.out.print("List (first-->last): ");
        DoublyLink current = first;
        while(current != null) {
            current.displayLink(); 
            current = current.next; 
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.print("List (last-->first): ");
        DoublyLink current = last;
        while(current != null) {
            current.displayLink(); 
            current = current.previous; 
        }
        System.out.println("");
    }
} 
