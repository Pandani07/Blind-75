import java.util.Stack;

public class validateBST {
    public boolean solution(TreeNode root){
        if(root==null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;

        while(!stack.isEmpty() || root!=null){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }

            root = stack.pop();
            if(root.val<=pre.val && pre!=null) return false;
            pre =root;
            root=root.right;
        }
        return true;
    }
}
