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
    public int hasPathSum(TreeNode A, int B) {
        int x = A.val;
        if(A.left ==null && A.right == null){
            if(B-x == 0){
                return 1;
            }else{
                return 0;
            }
        }
        int ans = 0;
        if(A.left != null){
            ans = ans | hasPathSum(A.left, B-x);
        }
        if(A.right != null){
            ans = ans | hasPathSum(A.right, B-x);
        }
        return ans;
    }
}
