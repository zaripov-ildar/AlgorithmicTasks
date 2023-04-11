package LeetCode.DesignCircularQueue_622;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {

    @Test
    void boringTest() {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        assertTrue(myCircularQueue.enQueue(1)); // return True
        assertTrue(myCircularQueue.enQueue(2));// return True
        assertTrue(myCircularQueue.enQueue(3)); // return True
        assertFalse(myCircularQueue.enQueue(4)); // return False
        assertEquals(3, myCircularQueue.Rear()); // return 3
        assertTrue(myCircularQueue.isFull()); // return True
        assertTrue(myCircularQueue.deQueue()); // return True

        myCircularQueue.enQueue(1); // return True
        myCircularQueue.enQueue(2); // return True
        myCircularQueue.enQueue(3); // return True
        myCircularQueue.enQueue(4); // return False
        myCircularQueue.Rear(); // return 3
        myCircularQueue.isFull(); // return True
        myCircularQueue.deQueue(); // return True

        assertTrue(myCircularQueue.enQueue(4)); // return True
        assertEquals(4, myCircularQueue.Rear()); // return 4
    }

}