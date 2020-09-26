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
    public int lca(TreeNode A, int B, int C) {
        if(!doesExist(A,B) || !doesExist(A,C))
            return -1;
        if(A.val == B && A.val == C)
            return A.val;
        TreeNode D = findLca(A,B,C);
        if(D == null)
            return -1;
        return D.val;
    }
    public boolean doesExist(TreeNode A, int B){
        if(A == null)
            return false;
        if(A.val == B)
            return true;
        else
            return doesExist(A.left,B) || doesExist(A.right,B);
    }
    public TreeNode findLca(TreeNode A, int B, int C) {
        if(A == null)
            return null;
        if(A.val == B || A.val == C)
            return A;
            
        TreeNode left_lca = findLca(A.left,B,C);
        TreeNode right_lca = findLca(A.right,B,C);
        if(left_lca != null && right_lca != null)
            return A;
        if(left_lca == null && right_lca == null)
            return null;
        if(left_lca != null)
            return left_lca;
        return right_lca;
    }
}
