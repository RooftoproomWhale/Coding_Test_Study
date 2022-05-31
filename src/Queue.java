public class Queue {
    private Node head;
    private Node tail;
    private int count;

    public void push(int value) {
        if (head == null) {
            head = new Node(value);
            tail = head;
        }else{
            tail.nextNode = new Node(value);
            tail = tail.nextNode;
        }
        ++count;
    }

    public int pop() {
        if (head == null) {
            return -1;
        }
        int returnValue = head.value;
        head = head.nextNode;
        --count;
        return returnValue;
    }

    public int size() {
        return count;
    }

    public int empty() {
        return head == null ? 1 : 0;
    }

    public int front(){
        return head.value;
    }
    public int back(){
        return tail.value;
    }


    static class Node {
        private int value;
        private Node nextNode;

        Node(int value) {
            this.value = value;
        }
    }
}
