public class Stack {
    private Node top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) return -1;

        int temp = top.data;
        top = top.next;

        return temp;
    }

    public int peek() {
        return (top == null) ? -1 : top.data;
    }

    @Override
    public String toString() {
        Node curr = top;
        StringBuilder res = new StringBuilder();
        while (curr != null) {
            res.append(curr.data).append(" -> ");
            curr = curr.next;
        }
        return res + "Null";
    }
}