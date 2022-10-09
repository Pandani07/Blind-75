import java.util.Stack;

public class kthSmallest {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        
        while(k!=0 || root!=null){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            TreeNode p = stack.pop();
            k--;
            if(k==0) return p.val;
            
            TreeNode right = p.right;
            while(right!=null){
                stack.push(right);
                right=right.left;
            }
        }
        return -1;
    }
}
