public class Day25 {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
    private boolean isValidBST(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;
        int val = node.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;
        if (!isValidBST(node.right, val, upper)) return false;
        if (!isValidBST(node.left, lower, val)) return false;

        return true;
    }
    public static void main(String[] args) {
        Day25 obj = new Day25();
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);
        System.out.println(obj.isValidBST(root1));
    }
}
