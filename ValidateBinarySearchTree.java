// Time Complexity :  O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

class Solution {
TreeNode prev;
public boolean isValidBST(TreeNode root) {
    // Stack<TreeNode> st = new Stack();
    // TreeNode prev = null;
    prev = null;
    return inorder(root);
}
private boolean inorder(TreeNode root){
    if(root == null) return true;
    // while(root != null || !st.isEmpty()){
        // while(root!=null){
        //     st.push(root);
        //     root = root.left;
        // }
        // root = st.pop();
        if( !inorder(root.left)) return false;
        if(prev != null && prev.val >= root.val) return false;
        prev = root;
        // root = root.right;
        //System.out.println(prev.val);
        return inorder(root.right);
// }
        //return true;
}
}