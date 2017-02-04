/**
 * Created by Mohammed M Khan on 2/2/2017.
 */
public class BinaryTree {

    BinaryTreeNode root;

    BinaryTree(){
        root=null;
    }

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


    void printPreOrder(){printPreOrder(root);}

    void printPostorder(){printPostorder(root);}

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
    }

}
