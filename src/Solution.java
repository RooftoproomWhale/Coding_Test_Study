public class Solution
{
    class Node
    {
        Node left;
        Node right;
        private final int data;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }

    class Tree
    {
        Node root;

        void createNode(int data)
        {
            if(root == null)
            {
                root = new Node(data);
            }
            else
            {
                findNode(root,data);
            }
        }
        private void findNode(Node node, int data)
        {
            if(node == null)
            {
                return;
            }

            if(node.getData() > data)
            {
                if(node.left == null)
                {
                    node.left = new Node(data);
                    return;
                }
                findNode(node.left,data);
            }
            else
            {
                if(node.right == null)
                {
                    node.right = new Node(data);
                    return;
                }
                findNode(node.right,data);
            }
        }

        void postOrder(Node node)
        {
            if(node == null) return ;

            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.getData());
        }
    }
    public void solution(String input)
    {
        Tree tree = new Tree();

        for (String s : input.split("\n"))
        {
            tree.createNode(Integer.parseInt(s));
        }

        tree.postOrder(tree.root);
    }
}
