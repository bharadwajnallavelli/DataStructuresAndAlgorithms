package SingleLinkedList.Examples;

class Node {
    public int value;
    public Node next;
}

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insertion in single linked list
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if(head == null) {
            createSingleLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while(index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // Traversal
    public void traversal() {
        if(head == null) {
            System.out.println("No linked list");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if(i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
    }

    // search for node
    public boolean searchNode(int nodeValue) {
        if(head != null) {
            Node tempNode = head;
            for(int i = 0; i < size; i++) {
                if(tempNode.value == nodeValue) {
                    System.out.println("found node at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }
    // deleting
    public void deleteNode(int location) {
        if(head == null) {
            System.out.println("Single linked list doesnt exist");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if(size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if(tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode= tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList sLL = new SingleLinkedList();
        sLL.createSingleLinkedList(5);
        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6,1);
        System.out.println(sLL.head.next.value);
        sLL.insertInLinkedList(7,3);
        System.out.println(sLL.head.next.next.value);
        sLL.traversal();
        System.out.println();
        System.out.println(sLL.searchNode(7));
        sLL.deleteNode(2);
        sLL.traversal();
    }
}
