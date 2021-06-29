package BinaryTree;
public class BinaryTreeApp {
     public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode node;
        node = new TreeNode(60);
        tree.insert(node);
        node = new TreeNode(40);
        tree.insert(node);
        node = new TreeNode(80);
        tree.insert(node);
        node = new TreeNode(30);
        tree.insert(node);
        node = new TreeNode(50);
        tree.insert(node);
        
        
        System.out.println("Traversal dengan PreOrder : ");
        tree.preOrder();
        System.out.println("\nTraversal dengan PostOrder : ");
        tree.postOrder();
        System.out.println("\nTraversal dengan inOrder : ");
        tree.inOrder();
        System.out.println();
    }
}

