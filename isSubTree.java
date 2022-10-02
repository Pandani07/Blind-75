public class isSubTree {
    public boolean isSTree(TreeNode s, TreeNode t){
        if(s==null) return false;
        if(isSame(s, t)) return true;
        return isSTree(s.left, t) || isSTree(s.right, t);
    }
    public boolean isSame(TreeNode s, TreeNode t){
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.val!=t.val) return false;
        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }
}
