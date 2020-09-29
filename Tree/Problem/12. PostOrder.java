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
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> B = new ArrayList<>();
        postRec(A,B);
        return B;
    }
    public void postRec(TreeNode A, ArrayList<Integer> B){
        if(A == null)
            return;
        postRec(A.left,B);
        postRec(A.right,B);
        B.add(A.val);
    }
}
