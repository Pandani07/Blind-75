public class maxDepthBTree {
    public int solution(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(solution(root.left), solution(root.right));
    }
}
