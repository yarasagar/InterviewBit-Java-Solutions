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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> B = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = A;
        if(curr == null)
            return B;
        while(curr != null || s.size()>0){
            while(curr != null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            B.add(curr.val);
            curr = curr.right;
        }
        return B;
    }
}
