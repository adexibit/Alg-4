public class LinkIterator {

    public LinkedList list;
    public Link current;
    public Link previus;

    public LinkIterator(LinkedList list) {
        this.list = list;
        this.reset();
    }

    private void reset() {
        current = list.first;
        previus = null;
    }

    public void nextLink() {
        previus = current;
        current = current.next;

    }

    public Link getCurrent() {
        return current;
    }

    public boolean atEnd() {
        return current.next == null;

    }

    public void insertBefore(String name, int age) {
        Link link = new Link(name, age);
        if (previus == null) {
            link.next = list.first;
            list.first = link;
            reset();
        } else {
            link.next = previus.next;
            previus.next = link;
            current = link;

        }
    }

    public void insertAfter(String name, int age) {
        Link link = new Link(name, age);
        if (list.isEmpty()) {
            list.first = link;
            current = link;

        } else {
            link.next = current.next;
            current.next = link;

        }

    }

    public String deleteCurrent() {
        String name = current.name;
        if (previus == null) {
            list.first = current.next;
            reset();

        } else {
            previus.next = current.next;
            if (atEnd()) reset();
            else current = current.next;
        }
        return name;
    }
}
