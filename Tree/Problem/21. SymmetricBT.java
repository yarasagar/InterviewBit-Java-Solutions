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
    public int isSymmetric(TreeNode A) {
        return isSysmRec(A,A) == true?1:0;
    }
    public boolean isSysmRec(TreeNode A, TreeNode B){
        if(A == null && B == null)
            return true;
        if(A != null && B != null && A.val == B.val){
            return isSysmRec(A.left,B.right)&&isSysmRec(A.right,B.left);
        }
        return false;
    }
}
