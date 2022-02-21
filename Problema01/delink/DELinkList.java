package Problema01.delink;

import Problema01.Link.LinkList;
import Problema01.Link.Link;

class DELinkList<T extends Comparable<T>> extends LinkList<T> {
    private Link<T> last;

    public DELinkList() {
        super();
        last = null;
    }

    @Override
    public void insertLast(T dd) {
        Link<T> newLink = new DELink<>(dd);
        if (isEmpty())
            first = newLink;
        else {
            Link<T> aux = last.getNext();
            aux = newLink;
        }
        last = newLink;
    }
}
