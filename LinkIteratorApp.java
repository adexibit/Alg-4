public class LinkIteratorApp {
    public static void main(String[] args) {
     LinkedList list = new LinkedList();
     LinkIterator iter = new LinkIterator(list);
     iter.insertBefore("John" , 22);
     iter.insertAfter("Oleg" , 33);
     iter.getCurrent().print();
     iter.deleteCurrent();
     iter.getCurrent().print();
    }

}
