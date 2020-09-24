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
        inorderRec(A,B);
        return B;
    }
    public void inorderRec(TreeNode A, ArrayList<Integer> B){
        if(A == null)
            return;
        inorderRec(A.left,B);
        B.add(A.val);
        inorderRec(A.right,B);
    }
}
