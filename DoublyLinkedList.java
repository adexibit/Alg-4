public class DoublyLinkedList {
    public Link first;
    public Link last;
    public DoublyLinkedList (Link first){
        first = null;


    }
    public void insertFirst(String name , int age){
        Link link = new Link(name ,age);
       if(this.isEmpty()) last = link;
        link.next = first;
        first = link;

    }
    public void insertLast (String name , int age){
        Link link = new Link(name,age);
        if (this.isEmpty())first = link;
        else last.next = link;
        last = link;
    }

    public Link deleteFirst(){
        Link temp = first;
        if (this.isEmpty())last = null;
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
public Link delete (String name){
        Link cur= first;
        Link pre = first;
        while (cur.name!=name){
            if(cur.next==null) return null;
            else {
                pre = cur;
                cur = cur.next;

            }
        }
        if (cur == first){
            first = first.next;
            }
        else pre.next = cur.next;
        return cur;
}

}

