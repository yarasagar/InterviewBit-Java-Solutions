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
    public int isSameTree(TreeNode A, TreeNode B) {
        return isSameRec(A,B)==true?1:0;
    }
    public boolean isSameRec(TreeNode A, TreeNode B){
        if(A == null && B == null)
            return true;
        if(A == null || B == null)
            return false;
        if(A.val == B.val)
            return isSameRec(A.left,B.left)&&isSameRec(A.right,B.right);
        return false;
    }
}
