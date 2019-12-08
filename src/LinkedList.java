public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    private boolean IsEmpty() {
        return head == null;
    }

    public void insert(int data) {
        Node direction = new Node(data);
        direction.next = head;
        head = direction;

    }

    public void print() {
        Node direction = head;
        while (direction != null) {
            System.out.println(direction.data);
            direction = direction.next;


        }
    }
}



