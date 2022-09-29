package LeetCode.DesignCircularQueue_622;

public class MyCircularQueue {
    private int front;
    private int rear;
    private final int[] circularQueue;

    public MyCircularQueue(int k) {
        this.front = this.rear = -1;
        circularQueue = new int[k];
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        } else if (isEmpty()) {
            front++;
        }
        rear = (rear + 1) % circularQueue.length;
        circularQueue[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % circularQueue.length;
        }
        return true;
    }

    public int Front() {
        if (front == -1) {
            return -1;
        }
        return circularQueue[front];
    }

    public int Rear() {
        if (rear == -1) {
            return -1;
        }
        return circularQueue[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % circularQueue.length == front;
    }
}
