import java.util.ArrayList;
import java.util.List;

public class Tree {
    private TreeNode root;

    public void append(NodeXY xy) {
        if (this.root == null) {
            root = new TreeNode(xy);
            return;
        }
        if (root.isLessThanTo(xy)) {
            if (root.getLeft() != null) {
                this.append(this.root.getLeft(), xy);
            } else {
                root.setLeft(new TreeNode(xy));
            }
        } else {
            if (root.getRight() != null) {
                this.append(this.root.getRight(), xy);
            } else {
                root.setRight(new TreeNode(xy));
            }
        }
    }

    private void append(TreeNode node, NodeXY xy) {
        if (node.isLessThanTo(xy)) {
            if (node.getLeft() == null) {
                node.setLeft(new TreeNode(xy));
                return;
            }
            this.append(node.getLeft(), xy);
        } else {
            if (node.getRight() == null) {
                node.setRight(new TreeNode(xy));
                return;
            }
            this.append(node.getRight(), xy);
        }
    }

    public int[][] getTraversals() {
        return new int[][]{traversalByOrder(TravalsalOrder.PREORDER), traversalByOrder(TravalsalOrder.POSTORDER)};
    }

    public int[] traversalByOrder(TravalsalOrder order) {
        List<Integer> traversal = new ArrayList<>();
        if (order == TravalsalOrder.PREORDER) traversal.add(this.root.getOrder());
        this.traversalByMode(this.root.getLeft(), traversal, order);
        this.traversalByMode(this.root.getRight(), traversal, order);
        if (order == TravalsalOrder.POSTORDER) traversal.add(this.root.getOrder());
        return traversal.stream().mapToInt(Integer::intValue).toArray();
    }

    private void traversalByMode(TreeNode node, List<Integer> traversal, TravalsalOrder order) {
        if (node == null) return;
        if (order == TravalsalOrder.PREORDER) traversal.add(node.getOrder());
        this.traversalByMode(node.getLeft(), traversal, order);
        this.traversalByMode(node.getRight(), traversal, order);
        if (order == TravalsalOrder.POSTORDER) traversal.add(node.getOrder());
    }

    enum TravalsalOrder {
        PREORDER, POSTORDER
    }
}
