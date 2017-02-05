/**
 * Created by Mohammed M Khan on 2/2/2017.  To anyone looking at my code, the comments should help you but I honestly made
 * the comments as a way to talk to myself as this is all being done as review for myself.
 *
 * This is the BTree class, it has a constructor which creates a node called root and sets it to null.
 * Basically the root is where the tree starts
 */
public class BinaryTree {

    BinaryTreeNode root;

    BinaryTree(){
        root=null;
    }

    /**Now this is my review of Post, Pre, and In Order.
     *
     * the methods take a node as the parameter. We want it to be set that when the user calls the method they input
     * the root as the param, thats what the wrappers are about, so the root is passed into the function, when the user calls the function
     * all he/she has to worry about is to have a tree that has root and children*/

    public void printPostorder(BinaryTreeNode node){
        if(node == null)
            return;

        printPostorder(node.left);

        printPostorder(node.right);

        System.out.println(node.dataInsideThisNode + " ");
    }

    public void printPreOrder(BinaryTreeNode node){
        if(node == null)
            return;

        System.out.println(node.dataInsideThisNode+ " ");

        printPreOrder(node.left);

        printPreOrder(node.right);
    }

    public void printInorder(BinaryTreeNode node){
        if(node==null)
            return;

        printInorder(node.left);

        System.out.println(node.dataInsideThisNode + " ");

        printInorder(node.right);
    }


    void printPreOrder(){printPreOrder(root);}

    void printPostorder(){printPostorder(root);}

    void printInorder(){printInorder(root);}

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root=new BinaryTreeNode(1);
        tree.root.left=new BinaryTreeNode(2);
        tree.root.right=new BinaryTreeNode(3);
        tree.root.left.left=new BinaryTreeNode(4);
        tree.root.left.right=new BinaryTreeNode(5);

        System.out.println("Postorder Traversal of Binary tress is ");
        tree.printPostorder();

        System.out.println("PreOrder Traversal is: ");
        tree.printPreOrder();

        System.out.println("InOrder Traversal is: ");
        tree.printInorder();
    }

}
