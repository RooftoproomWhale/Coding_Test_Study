public class Solution
{
    class Node
    {
        private Node left;
        private Node right;
        private final Character data;

        public Node(Character data) {
            this.data = data;
        }

        public Character getData() {
            return data;
        }
    }

    class Tree
    {
        private Node root;

        private void createNode(char data, char left, char right)
        {
            if(root == null)
            {
                root = new Node(data);
                root.left = (left == '.') ? null : new Node(left);
                root.right = (right == '.') ? null : new Node(right);
            }
            else
            {
                findNode(root,data,left,right);
            }
        }
        private void findNode(Node node, char data, char left, char right)
        {
            if(node == null) return;

            if(node.getData() == data)
            {
                node.left = (left == '.') ? null : new Node(left);
                node.right = (right == '.') ? null : new Node(right);
            }
            else
            {
                findNode(node.left,data,left,right);
                findNode(node.right,data,left,right);
            }
        }

        private void preOrder(Node node)
        {
            if(node == null) return ;

            System.out.print(node.getData());

            preOrder(node.left);
            preOrder(node.right);
        }

        private void inOrder(Node node)
        {
            if(node == null) return ;

            inOrder(node.left);
            System.out.print(node.getData());
            inOrder(node.right);
        }

        private void postOrder(Node node)
        {
            if(node == null) return ;

            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.getData());
        }
    }


    public void solution(String inputString)
    {
        Tree tree = new Tree();

        for(String s : inputString.split("\n"))
        {
            char[] nodeData = s.toCharArray();
            char data = nodeData[0];
            char left = nodeData[1];
            char right = nodeData[2];

            tree.createNode(data,left,right);
        }

        tree.preOrder(tree.root);
        System.out.println();

        tree.inOrder(tree.root);
        System.out.println();

        tree.postOrder(tree.root);
        System.out.println();

    }
}
