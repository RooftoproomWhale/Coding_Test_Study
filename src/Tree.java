public class Tree {
    private TreeNode root;

    public void init(String commend) {
        String[] lines = commend.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String[] nodes = lines[i].trim().split(" ");
            this.append(nodes[0].trim(), nodes[1].trim(), nodes[2].trim());
        }
    }

    public void append(String nodeValue, String leftValue, String rightValue) {
        if (this.root == null) {
            root = new TreeNode(nodeValue);
            root.setLeft(new TreeNode(leftValue));
            root.setRight(new TreeNode(rightValue));
            return;
        }
        this.append(this.root.getLeft(), nodeValue, leftValue, rightValue);
        this.append(this.root.getRight(), nodeValue, leftValue, rightValue);
    }

    private void append(TreeNode node, String nodeValue, String leftValue, String rightValue) {
        if (node == null) return;
        if (node.equalsValue(nodeValue)) node.setLeftRightNode(leftValue, rightValue);
        this.append(node.getLeft(), nodeValue, leftValue, rightValue);
        this.append(node.getRight(), nodeValue, leftValue, rightValue);
    }

    public void preorderTraversal() {
        this.root.printValue();
        this.preorderTraversal(this.root.getLeft());
        this.preorderTraversal(this.root.getRight());
        System.out.println();
    }

    private void preorderTraversal(TreeNode node) {
        if (node == null) return;
        if (!node.isEmptyValue()) node.printValue();
        this.preorderTraversal(node.getLeft());
        this.preorderTraversal(node.getRight());
    }

    public void inorderTraversal() {
        this.inorderTraversal(this.root.getLeft());
        this.root.printValue();
        this.inorderTraversal(this.root.getRight());
        System.out.println();
    }

    private void inorderTraversal(TreeNode node) {
        if (node == null) return;
        this.inorderTraversal(node.getLeft());
        if (!node.isEmptyValue()) node.printValue();
        this.inorderTraversal(node.getRight());
    }

    public void postorderTraversal() {
        this.postorderTraversal(this.root.getLeft());
        this.postorderTraversal(this.root.getRight());
        this.root.printValue();
        System.out.println();
    }

    private void postorderTraversal(TreeNode node) {
        if (node == null) return;
        this.postorderTraversal(node.getLeft());
        this.postorderTraversal(node.getRight());
        if (!node.isEmptyValue()) node.printValue();
    }

}
