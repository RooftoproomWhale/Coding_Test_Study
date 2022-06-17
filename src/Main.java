import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 백준 제출용
class Node
{
    Node left;
    Node right;
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
    Node root;

    void createNode(char data, char left, char right)
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

    void preOrder(Node node)
    {
        if(node == null) return ;

        System.out.print(node.getData());
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(Node node)
    {
        if(node == null) return ;

        inOrder(node.left);
        System.out.print(node.getData());
        inOrder(node.right);
    }

    void postOrder(Node node)
    {
        if(node == null) return ;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.getData());
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Tree tree = new Tree();

        for(int i = 0; i < N; i++)
        {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            char data = tokenizer.nextToken().charAt(0);
            char left = tokenizer.nextToken().charAt(0);
            char right = tokenizer.nextToken().charAt(0);

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