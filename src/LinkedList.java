public class LinkedList {
    private Node head;
    private int size;


    public void insert(int data) {
        Node direction = new Node(data);
        direction.next = null;
        if (head == null) {
            head = direction;
        } else {
            Node following = head;
            while (following.next != null) {
                following = following.next;
            }
            following.next = direction;


        }
    }

    public void print() {
        Node direction = head;
        while (direction != null) {
            System.out.println(direction.data);
            direction = direction.next;
        }
    }

    public int size() {
        if (head == null) return 0;
        {
            Node lastNode = head;
            int size = 1;
            for (; lastNode.getNext() != null; size++) {
                lastNode = lastNode.getNext();
            }
            return size;
        }
    }
}



