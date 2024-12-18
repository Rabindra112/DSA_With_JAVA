package untitled;
class SingularLinkedList {
    Node head;
    private int size;

    SingularLinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add First
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Add Last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        size++;
    }

    // Insert at Position
    public void insertAtPosition(String data, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);

        // Insert at the head
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node currNode = head;
            for (int i = 1; i < position; i++) {
                currNode = currNode.next;
            }
            newNode.next = currNode.next;
            currNode.next = newNode;
        }
        size++;
    }

    // Delete at Position
    public void deleteAtPosition(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        // Delete at the head
        if (position == 0) {
            head = head.next;
        } else {
            Node currNode = head;
            for (int i = 1; i < position; i++) {
                currNode = currNode.next;
            }
            currNode.next = currNode.next.next;
        }
        size--;
    }

    // Print List
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        System.out.println();
    }

    // Delete First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--; // Decrease size
    }

    // Delete Last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node secondNode = head;
            Node lastNode = head.next;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
                secondNode = secondNode.next;
            }
            secondNode.next = null;
        }
        size--; // Decrease size
    }

    // Get Size
    public int getSize() {
        return size; // Simply return the size field
    }

    public static void main(String args[]) {
        SingularLinkedList list = new SingularLinkedList();
        
        // Adding some elements
        list.addFirst("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");

        list.printList();  // Print the current list

        // Insert at position 2 (between "is" and "a")
        list.insertAtPosition("new", 2);
        list.printList();  // Print after insertion

        // Delete at position 3 (the "list" node)
        list.deleteAtPosition(3);
        list.printList();  // Print after deletion

        // Get the current size
        int a = list.getSize();
        System.out.println("Size: " + a);
    }
}
