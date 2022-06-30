public class Solution {
    public static void main(String[] args) {
        String commend = " A B C\nB D .\nC E F\nE . .\nF . G\nD . .\nG . .";
        final Tree tree = new Tree();
        tree.init(commend);
        tree.preorderTraversal();
        tree.inorderTraversal();
        tree.postorderTraversal();
    }
}
