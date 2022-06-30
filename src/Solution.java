public class Solution {
    public static void main(String[] args) {
        String commend = "50\n30\n24\n5\n28\n45\n98\n52\n60";
        final Tree tree = new Tree();
        tree.init(commend);
        tree.traversal();
    }
}
