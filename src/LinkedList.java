public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next=null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) ;
            {
                n.next = n;

            }
            n.next = node;
        }}}