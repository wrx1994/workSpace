package com.example.demo.sort;

import java.util.ArrayList;
import java.util.List;

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
        Node newNode = null;
        Node next ;
        while (node != null) {
            next = node.next;
            node.next = newNode;
            newNode = node;
            node = next;
        }
        return newNode;
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        Node  listNode= new Node();
        Node p ;
        p = listNode;
        int sum = 0;

        while (l1 != null || l2 != null || sum != 0) {
            if (l1 != null) {
                sum += l1.value;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.value;
                l2 = l2.next;
            }
            p.next =new Node();
            sum = sum / 10;
            p = p.next;
        }
        return listNode.next;
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        ListSort dataSort = new ListSort();
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
        Node node = dataSort.reverseList(head1);
        System.out.println(node);
    }
}
