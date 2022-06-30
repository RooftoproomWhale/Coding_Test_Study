public class Tree {
    private TreeNode root;

    public void init(String commend) {
        String[] lines = commend.split("\n");
        for (int i = 0; i < lines.length; i++) {
            this.append(Integer.parseInt(lines[i].trim()));
        }
    }

    public void append(int nodeValue) {
        if (this.root == null) {
            root = new TreeNode(nodeValue);
            return;
        }
        if (root.isLessThanTo(nodeValue)) {
            if (root.getLeft() != null) {
                this.append(this.root.getLeft(), nodeValue);
            } else {
                root.setLeft(new TreeNode(nodeValue));
            }
        } else {
            if (root.getRight() != null) {
                this.append(this.root.getRight(), nodeValue);
            } else {
                root.setRight(new TreeNode(nodeValue));
            }
        }
    }

    private void append(TreeNode node, int nodeValue) {
        if (node.isLessThanTo(nodeValue)) {
            if (node.getLeft() == null) {
                node.setLeft(new TreeNode(nodeValue));
                return;
            }
            this.append(node.getLeft(), nodeValue);
        } else {
            if (node.getRight() == null) {
                node.setRight(new TreeNode(nodeValue));
                return;
            }
            this.append(node.getRight(), nodeValue);
        }

    }

    public void traversal() {
        this.traversal(this.root.getLeft());
        this.traversal(this.root.getRight());
        this.root.printValue();
    }

    private void traversal(TreeNode node) {
        if (node == null) return;
        this.traversal(node.getLeft());
        this.traversal(node.getRight());
        node.printValue();
    }
}
