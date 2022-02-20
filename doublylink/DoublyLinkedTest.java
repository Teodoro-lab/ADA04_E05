package doublylink;
public class DoublyLinkedTest {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> theList = new DoublyLinkedList<>();
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);
        theList.displayForward();
        theList.displayBackward();
        theList.deleteFirst();
        theList.deleteLast();
        theList.deleteKey(11);
        theList.displayForward();
        theList.insertAfter(22, 77);
        theList.insertBefore(22, 78);
        theList.insertAfter(33, 88);
        theList.insertBefore(33, 89);
        theList.displayForward();
        theList.displayFirst();
        theList.displayLast();
        theList.displaySize();
        theList.deletePos(4);
        theList.displayForward();
        theList.find(33);
        System.out.println(theList.find(33));
        theList.find(27);
        System.out.println(theList.find(27));
        theList.replace(1, 100);
        theList.displayForward();
        theList.insertInOrder(120, true);// ascendente
        theList.insertInOrder(115, true);// Descendente
        theList.displayForward();
        theList.clear();
        theList.displayForward();
    }
}