package question4;

public class MaincodeBST {

    public static void main(String[] args) {
        BinarySearchTree_BST tree = new BinarySearchTree_BST();

        // Insert nodes in the given order
        int[] keys = {15, 17, 12, 4, 17, 9, 2, 20, 21, 27};
        for (int key : keys) {
            tree.insert(key);
        }

        // Print traversals
        System.out.println("In-order traversal (sorted order):");
        tree.inorder();   

        System.out.println("\n\nPre-order traversal:");
        tree.preorder();  

        System.out.println("\n\nPost-order traversal:");
        tree.postorder();
    }
}