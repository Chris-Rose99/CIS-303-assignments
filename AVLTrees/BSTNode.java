/////////////////////////////////////////////////////////////////////
// BSTNode.java: code for BSTNode class
// CIS 303 Analysis of Algorithms
// Fall 2018
// Revised 19 October 2018, L. Grabowski
/////////////////////////////////////////////////////////////////////

public class BSTNode {
    
    // Fields
    int data;
    BSTNode left;
    BSTNode right;
    int height;
    
    // Constructors
    BSTNode (int data) {
        this(data, null, null);
    }
    
    BSTNode (int data, BSTNode left, BSTNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.height = 0;
    }
    
    // Param: int value - to insert
    //        BSTNode rt - node that roots this subtree
    // Returns: new root of this subtree
    public BSTNode insert (int value, BSTNode rt) {
        if (rt == null)
            return new BSTNode(value, null, null);
        if (value < rt.data)
            rt.left = insert(value, rt.left);
        else if (value > rt.data)
            rt.right = insert(value, rt.right);
        // else this is a duplicate, do nothing
        rt.height = Math.max(height(rt.left), height(rt.right)) + 1;
        return rt;
    }
    
    // Returns : String representation of tree root at this node
    public String toString() {
        return toString(this);
    }
    
    // Param: BSTNode rt
    // Returns : String representation of tree root at rt
    private String toString(BSTNode rt) {
        if (rt == null)
            return "";
        if (rt.left == null && rt.right == null)
            return rt.data + " ";
        String result = rt.data + " ";
        if (rt.left != null)
            result += toString(rt.left);
        if (rt.right != null)
            result += toString(rt.right);
        return result;
        
    }
    
    // Param: BSTNode n
    // Returns: height of largest subtree, -1 if n is null
    private int height (BSTNode n) {
        return n == null ? -1 : n.height;
    }
}
