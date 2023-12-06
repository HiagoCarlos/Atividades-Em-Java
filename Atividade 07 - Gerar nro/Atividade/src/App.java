import java.util.Random;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public void insertSorted(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        if (data <= head.data) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        if (current.next == null) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    public void printAscending() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printDescending() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void removePrimes() {
        Node current = head;
        while (current != null) {
            if (isPrime(current.data)) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (current == tail) {
                    tail = current.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
            }
            current = current.next;
        }
    }
}

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[1000];

        DoublyLinkedList lista = new DoublyLinkedList();

        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt(19999) - 9999;
            vetor[i] = randomNumber;
            lista.insertSorted(randomNumber);
        }

        System.out.println("Lista em ordem crescente:");
        lista.printAscending();

        System.out.println("Lista em ordem decrescente:");
        lista.printDescending();

        lista.removePrimes();

        System.out.println("Lista após remover números primos:");
        lista.printAscending();
    }
}
