import java.util.Arrays;
import java.util.Comparator;

public class Solution
{
    class Node
    {
        Node left;
        Node right;
        private final int x,y;
        private final int data;

        public Node(int x, int y, int data) {
            this.x = x;
            this.y = y;
            this.data = data;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getData() {
            return data;
        }
    }
    class Tree
    {
        Node root;
        private final int[][] result;
        int index = 0;

        public Tree(int length) {
            this.result = new int[2][length];
        }

        void createNode(Node node)
        {
            findNode(root,node.getX(),node.getY(),node.getData());
        }
        void findNode(Node node,int x, int y, int data)
        {
            if(node == null) return;

            if(node.getX() > x)
            {
                if(node.left == null)
                {
                    node.left = new Node(x,y,data);
                    return;
                }
                findNode(node.left, x, y, data);
            }
            else
            {
                if(node.right == null)
                {
                    node.right = new Node(x,y,data);
                    return;
                }
                findNode(node.right, x, y, data);
            }
        }

        public void preOrder(Node node)
        {
            if(node == null) return;

            result[0][index++] = node.getData();
            preOrder(node.left);
            preOrder(node.right);
        }
        public void postOrder(Node node)
        {
            if(node == null) return;

            postOrder(node.left);
            postOrder(node.right);
            result[1][index++] = node.getData();
        }

        public int[][] getResult() {
            return result;
        }
    }
    public int[][] solution(int[][] nodeinfo) {
        int[][] answer = {};

        Node[] nodelist = new Node[nodeinfo.length];
        for (int i = 0; i < nodeinfo.length; i++)
        {
            int x = nodeinfo[i][0];
            int y = nodeinfo[i][1];
            int data = i + 1;

            nodelist[i] = new Node(x, y, data);
        }
        Arrays.sort(nodelist, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o2.y - o1.y;
            }
        });

        Tree tree = new Tree(nodeinfo.length);
        tree.root = nodelist[0];
        for (int i = 1; i < nodelist.length; i++)
        {
            tree.createNode(nodelist[i]);
        }

        tree.preOrder(tree.root);
        tree.index = 0;
        tree.postOrder(tree.root);

        return tree.getResult();
    }
}
