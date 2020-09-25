/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> B = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = A;
        if(curr == null)
            return B;
        s.push(curr);
        while(s.size()>0){
            curr = s.pop();
            B.add(curr.val);
            if(curr.right != null)
                s.push(curr.right);
            if(curr.left != null)
                s.push(curr.left);
        }
        return B;
    }
}
