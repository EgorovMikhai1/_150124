package org.example._2024_04_29;

public class MyLL {
    int value;
    MyLL next;

    public MyLL(int value) {
        this.value = value;
        this.next = null;
    }

    public static boolean isCycled(MyLL head) {
        if (head == null) {
            return false;
        }

        MyLL slow = head;
        MyLL fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }


    public static void main(String[] args) {
        MyLL n1 = new MyLL(1);
        MyLL n2 = new MyLL(2);
        MyLL n3 = new MyLL(3);
        MyLL n4 = new MyLL(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        System.out.println(isCycled(n1));
    }
}
