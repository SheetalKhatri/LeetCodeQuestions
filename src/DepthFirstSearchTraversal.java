import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearchTraversal {
    /*
        a                      1
       / \                    / \
      b   g                  2   3
     / \                    / \
    c   d                  4   5
   /                      /
  e                      6
   \                      \
    f                      7
    */
    public static void main(String[] args) {
        Node data = createData();
        NodeInt input = createDataInt();
        List<Integer> preOrdered = new ArrayList<>();
        preOrderTraversalInt(input, preOrdered);
        for(int num : preOrdered) System.out.println(num);
        //postorderTraversal(data);
        //System.out.println(sumLeftChild(input, 0));
        //System.out.println(sumLeftChild2(input));
        ListNode linkedList = new ListNode();
        linkedList = ListNode.convertToLinkedList(preOrdered);
        ListNode.printLinkedList(linkedList);
    }

    public static void preorderTraversal(Node n) {
        if(n == null) return;
        System.out.println(n.value);
        preorderTraversal(n.left);
        preorderTraversal(n.right);
    }
    public static void inorderTraversal(Node n) {
        if(n == null) return;
        inorderTraversal(n.left);
        System.out.println(n.value);
        inorderTraversal(n.right);
    }
    public static void postorderTraversal(Node n) {
        if(n == null) return;
        postorderTraversal(n.left);
        postorderTraversal(n.right);
        System.out.println(n.value);
    }

    public static void preOrderTraversalInt(NodeInt n, List<Integer> preOrdered) {
        if(n == null) return;
        preOrdered.add(n.value);
        preOrderTraversalInt(n.left, preOrdered);
        preOrderTraversalInt(n.right, preOrdered);
    }
    public static int sumLeftChild(NodeInt n, int sum) {
        if (n.left != null) {
            System.out.println(n.value);
            System.out.println("sum: " + sum);
            return sumLeftChild(n.left, n.value + sum);
        }

        return n.value + sum;
    }

    public static int sumLeftChild2(NodeInt n) {
         if (n == null) return 0;
         return n.value + sumLeftChild2(n.left);
    }

    public static NodeInt createDataInt() {
        NodeInt one = new NodeInt(1);
        NodeInt two = new NodeInt(2);
        NodeInt three = new NodeInt(3);
        NodeInt four = new NodeInt(4);
        NodeInt five = new NodeInt(5);
        NodeInt six = new NodeInt(6);
        NodeInt seven = new NodeInt(7);
        NodeInt eight = new NodeInt(8);

        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        four.left = six;
        six.right = seven;
        return one;

    }
    public static Node createData() {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");

        a.left = b;
        a.right = g;
        b.left = c;
        b.right = d;
        c.left = e;
        e.right = f;

        return a;
    }


}

