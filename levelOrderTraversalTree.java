import java.util.*;
public class levelOrderTraversalTree {
    public List<List<Integer>> solution(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> current = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode cur_node = q.remove();
                current.add(cur_node.val);
                if(cur_node.left!=null) q.offer(cur_node.left);
                if(cur_node.right!=null) q.offer(cur_node.right);
            }
            res.add(current);
        }
        return res;
    }
}
