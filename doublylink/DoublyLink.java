package doublylink;

public class DoublyLink<T> {
    public T dData;
    public DoublyLink<T> next;
    public DoublyLink<T> previous;

    public T getdData() {
        return dData;
    }

    public void setdData(T dData) {
        this.dData = dData;
    }

    public DoublyLink<T> getNext() {
        return next;
    }

    public void setNext(DoublyLink<T> next) {
        this.next = next;
    }

    public DoublyLink<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyLink<T> previous) {
        this.previous = previous;
    }

    public DoublyLink(T d) {
        dData = d;
    }

    public void displayLink() {
        System.out.print(dData + ",");
    }
}
