package com.example.demo.sort;

/**
 * 链表
 */
public class ListSort {

    /**
     * 链表翻转----递归法
     * @param head
     * @return
     */
    public Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node temp = head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }

    /**
     * 链表翻转----遍历法
     * @param node
     * @return
     */
    public static Node reverseList(Node node) {
        Node pre = null;
        Node next ;
        while (node != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        DataSort dataSort = new DataSort();
        int[] a = {45,56,23,43,1,5,8};
        //  System.out.print(Arrays.toString(dataSort.showSort(a)));
        Node head1 = new Node();
        Node head2 = new Node();
        Node head3 = new Node();
        Node head4 = new Node();
        head1.setValue(1);
        head2.setValue(2);
        head3.setValue(3);
        head4.setValue(4);
        head1.setNext(head2);
        head2.setNext(head3);
        head3.setNext(head4);
        System.out.println(head1);
    }
}
