public class invertBinaryTree {
    public TreeNode solution(TreeNode root){
        if(root==null) return root;
        TreeNode right = solution(root.right);
        TreeNode left = solution(root.left);
        root.right=left;
        root.left=right;
        return root;
    }
}
