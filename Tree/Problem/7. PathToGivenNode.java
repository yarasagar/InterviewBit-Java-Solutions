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
    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> C = new ArrayList<>();
        if(solveRec(A,B,C)){
            return C;
        }else{
            return null;
        }
    }
    public boolean solveRec(TreeNode A, int B, ArrayList<Integer> C){
        if(A == null)
            return false;
        C.add(A.val);
        if(A.val == B){
            return true;
        }
        if(solveRec(A.left,B,C) || solveRec(A.right,B,C))
            return true;
        
        C.remove(C.size()-1);
        return false;
    }
}
