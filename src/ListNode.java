import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int value;
    ListNode next;
    ListNode(){};
    ListNode(int value,ListNode next){
        this.value = value;
        this.next = next;
    }

    public static ListNode findVal(ListNode head, int val){
        ListNode curr = head;
        while (curr != null) {
            if (curr.value == val) return curr;
            curr = curr.next;
        }
        return null;
    }
    public static ListNode findPrevNode(ListNode head, int val) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            if (curr.value == val) return prev;
            prev = curr;
            curr = curr.next;
        }
        return null;
    }

    public static void insertVal(ListNode head, int search, int insert){
        ListNode searchNode = findVal(head,search);
        ListNode insertNode = new ListNode();
        insertNode.next = searchNode.next;
        searchNode.next = insertNode;
        insertNode.value = insert;
        while(head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }

    public static ListNode convertToLinkedList(int[] data) {
        ListNode node = new ListNode();
        ListNode head = node;
        for (int i = 0; i < data.length; i++) {
            node.value = data[i];

            if (i != data.length - 1) {
                node.next = new ListNode();
                node = node.next;
            } else {
                node.next = null;
            }
        }
        return head;
    }

    public static ListNode convertToLinkedList(List<Integer> data) {
        ListNode node = new ListNode();
        ListNode head = node;
        for (int i = 0; i < data.size(); i++) {
            node.value = data.get(i);

            if (i != data.size() - 1) {
                node.next = new ListNode();
                node = node.next;
            } else {
                node.next = null;
            }
        }
        return head;
    }

    public static void printLinkedList(ListNode l) {
        while(l != null) {
            System.out.println(l.value);
            l = l.next;
        }
    }
    public static void main(String[] args){
        int[][] inputs = {
                {23, 89, 10, 5, 67, 39, 70,28},
                {34, 53, 6, 95, 38, 28, 17, 63, 16, 76},
                {288, 224, 275, 390, 4, 383, 330, 60, 193},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {69, 8, 49, 106, 116, 112, 104, 129, 39, 14, 27, 12}
        };

//        for (int[] in: inputs) {
//            ListNode node = convertToLinkedList(in);
//            findVal(node, 1234);
//        }
        ListNode node = convertToLinkedList(inputs[0]);

        System.out.println(
                findPrevNode(
                        node,
                        5
                )
        );
    }
}

