package Problema01.delink;

public class DELinkListTest {
    
    public static void main(String[] args) {
        DELinkList<Double> list = new DELinkList<>(); 
        list.insertFirst(2.99);
        list.insertFirst(4.99);
        list.insertFirst(6.99);
        list.insertFirst(8.99);
        list.displayList(); 
        
        list.deleteFirst();
        list.deleteFirst();    

        list.displayList(); 
    } 
}
