public class LinkedList {
    private Node head;

    public void insert(int data) {
        Node direction = new Node(data);
        direction.next = null;
        if (head == null) {
            head = direction;
        } else {
            Node following = head;
            while (following.next == null) {
                following.next = direction;
                



            }
        }

    }

    public void print() {
        Node direction = head;
        while (direction != null) {
            System.out.println(direction.data);
            direction = direction.next;


        }
    }
}



