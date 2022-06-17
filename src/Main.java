import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 백준 제출용
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
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Tree tree = new Tree();

        String input;
        while (true) {
            input = br.readLine();
            if (input == null || input.equals(""))
                break;
            tree.createNode(Integer.parseInt(input));
        }

        tree.postOrder(tree.root);
        br.close();
    }
} 