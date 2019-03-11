public class LinkedList {
    public Link first;
    public LinkedList (){
        first = null;


    }
    public void insert(String name , int age){
        Link link = new Link(name ,age);
        link.next = first;
        first = link;

    }
    public Link delete(){
        Link temp = first;
        first = first.next;
        return temp;
    }
    public void print(){
        Link current =first;
        while (current != null){
            current.print();
            current = current.next;

        }
    }
    public boolean isEmpty(){
        return first == null;

    }

    public Link find (String name){
        Link current = first;
        while (current.name != name){
            if
            (current.next == null) return null;
            else current = current.next;
        }
        return current;
    }


}
