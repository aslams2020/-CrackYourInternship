public class InvertBT {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return null;
        q.add(root);
        while(q.size()>0) {
            TreeNode curr = q.remove();
            TreeNode temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;

            if(curr.left != null)  q.add(curr.left);
            if(curr.right != null)  q.add(curr.right);
        }
        return root;
    }
}
