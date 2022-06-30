public
class TreeNode {
    private NodeXY xy;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(NodeXY xy) {
        this.xy = xy;
    }

    public boolean isLessThanTo(NodeXY nodeValue) {
        return this.xy.getX() > nodeValue.getX();
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getOrder() {
        return this.xy.getOrder();
    }
}