package common;

public class ListNode {
    private int key;
    private ListNode next;
    private ListNode prev;

    public ListNode(int key) {
        this.key = key;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}
