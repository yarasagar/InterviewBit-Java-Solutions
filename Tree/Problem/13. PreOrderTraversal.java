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
        preOrderRec(A,B);
        return B;
    }
    public void preOrderRec(TreeNode A, ArrayList<Integer> B){
        if(A != null){
            B.add(A.val);
            preOrderRec(A.left,B);
            preOrderRec(A.right,B);
        }
    }
}
