/////////////////////////////////////////////////////////////////////
// AVLClient.java: skeleton client code for AVLNode class
// CIS 303 Analysis of Algorithms
// Fall 2018
// Revised 19 October 2018, L. Grabowski
/////////////////////////////////////////////////////////////////////
import java.util.*;
import java.io.*;

public class AVLClient {
    public static void main (String [] args) throws FileNotFoundException {
        // Here we construct a BST and then print it for sanity testing
        BSTNode bstroot = new BSTNode(10);
        bstroot = bstroot.insert(8, bstroot);
        bstroot = bstroot.insert(12, bstroot);
        System.out.println(bstroot.height);
        System.out.println(bstroot);
        
        // Here we construct a AVL Tree and then print it
        AVLNode root = new AVLNode(10);
        root = root.insert(8, root);
        root = root.insert(12, root);
        // Please note the the height reported is really the depth
        // of the tree from the root. Until the balancing algorithm
        // is implemented this value will be incorrect. The value
        // shown will be 1 less than the actual height.
        System.out.println(root.height);
        System.out.println(root);
    }
}
