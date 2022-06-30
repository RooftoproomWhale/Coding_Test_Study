public
class TreeNode {
    private final String value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(String value) {
        this.value = value;
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

    public void setLeftRightNode(String leftValue, String rightValue) {
        this.left = new TreeNode(leftValue);
        this.right = new TreeNode(rightValue);
    }

    public boolean equalsValue(String value) {
        return this.value.equals(value);
    }

    public void printValue() {
        System.out.print(this.value);
    }

    public boolean isEmptyValue() {
        return this.value.equals(".");
    }
}