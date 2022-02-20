public class DoublyLinkedList<T extends Comparable<T>> {
    private DoublyLink<T> first;
    private DoublyLink<T> last;
    private int size;
    // private int pos;

    public DoublyLinkedList() {
        first = null;
        last = null;
        size = 0;
        // pos = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(T dd) {
        DoublyLink<T> newLink = new DoublyLink<>(dd);
        if (isEmpty())
            last = newLink;
        else
            first.previous = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(T dd) {
        DoublyLink<T> newLink = new DoublyLink<>(dd);
        if (isEmpty())
            first = newLink;
        else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public DoublyLink<T> deleteFirst() {
        DoublyLink<T> temp = first;
        if (first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;
        return temp;
    }

    public DoublyLink<T> deleteLast() {
        DoublyLink<T> temp = last;
        if (first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(T key, T dd) {
        DoublyLink<T> current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null)
                return false;
        }
        DoublyLink<T> newLink = new DoublyLink<>(dd);
        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public boolean insertBefore(T key, T dd) {
        DoublyLink<T> current = last;
        while (current.dData != key) {
            current = current.previous;
            if (current == null)
                return false;
        }
        DoublyLink<T> newLink = new DoublyLink<>(dd);
        if (current == first) {
            newLink.previous = null;
            first = newLink;
        } else {
            newLink.previous = current.previous;
            current.previous.next = newLink;
        }
        newLink.next = current;
        current.previous = newLink;
        return true;
    }

    public DoublyLink<T> deleteKey(T key) {
        DoublyLink<T> current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null)
                return null;
        }
        if (current == first)
            first = current.next;
        else
            current.previous.next = current.next;
        if (current == last)
            last = current.previous;
        else
            current.next.previous = current.previous;
        return current;
    }

    public void deletePos(long pos) {
        if (pos < 1) { // La posicion en este caso inicia desde 1
            System.out.print("Position not valid");
        } else if (pos == 1 && first != null) {
            first = first.next;
            if (first != null) {
                first.previous = null;
            }
        } else {
            DoublyLink<T> temp = first;
            for (int i = 1; i < pos - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
                if (temp.next.next != null) {
                }
                temp.next.next.previous = temp.next;
            }
        }

    }

    public void displayForward() {
        System.out.print("List (first-->last): ");
        DoublyLink<T> current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.print("List (last-->first): ");
        DoublyLink<T> current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println("");
    }

    public void displayFirst() {
        System.out.print("List (first-->: )");
        DoublyLink<T> temp = first;
        if (temp == first) {
            temp.displayLink();
        }
        System.out.println("");
    }

    public void displayLast() {
        System.out.print("List (Last-->: )");
        DoublyLink<T> temp = last;
        if (temp == last) {
            temp.displayLink();
        }
        System.out.println("");
    }

    public void displaySize() {
        DoublyLink<T> current = first;
        while (current != null) {
            size++;
            current = current.next;
        }
        System.out.println("Number of nodes--> " + size);
    }

    public void insertBefore(T dd) {
        DoublyLink<T> newLink = new DoublyLink<>(dd);
        if (isEmpty())
            first = newLink;
        else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public void clear() {
        first = null;
        System.out.println("Lista eliminada:");
    }

    public long find(T dd) {
        long index = 0;
        DoublyLink<T> aux = first;
        while (aux != null) {
            if (aux.dData.equals(dd)) {
                return index;
            }
            index++;
            aux = aux.next;
        }
        return -1;
    }

    public boolean replace(long pos, T dd) {
        DoublyLink<T> aux = first;
        DoublyLink<T> previous = null;
        first.previous = null;
        aux = aux.next;
        while (aux != null && pos > 0) {
            pos--;
            previous = aux;
            aux = aux.next;
        }
        if (pos > 0) {
            return false;
        }
        if (previous != null) {
            previous.dData = dd;
        }
        return true;
    }

    /*
     * public DoublyLink<T> insertGrowing(T dd) {
     * DoublyLink<T> current = first;
     * DoublyLink<T> newLink = new DoublyLink<>(dd);
     * if (isEmpty()) {
     * first = newLink;
     * } else if (first.dData.equals(newLink.dData)) {
     * newLink.next = first;
     * newLink.next.previous = newLink;
     * first = newLink;
     * } else {
     * current = first;
     * while (current.next != null && current.next.dData.compareTo(newLink.dData) <
     * 0) {
     * current = current.next;
     * }
     * if (current.next != null) {
     * newLink.next.previous = newLink;
     * }
     * current.next = newLink;
     * newLink.previous = current;
     * }
     * 
     * return first;
     * 
     * }
     */

    public void insertInOrder(T obj, boolean ascendant) {
        if (isEmpty()) {
            insertFirst(obj);
            return;
        }

        DoublyLink<T> aux = first;

        while (aux != null) {
            if (ascendant) {
                if (obj.compareTo(aux.dData) > 0) {
                    insertAfter(aux.dData, obj);
                    return;
                }
            } else {
                if (obj.compareTo(aux.dData) > 0) {
                    insertBefore(aux.dData, obj);
                    return;
                }
            }
            aux = aux.next;
        }
    }

}