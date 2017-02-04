/**
 * Created by Mohammed M Khan on 2/2/2017.
 * I should have named this class just Node, but whatever
 * the purpose of this class is to create a Node in a Binary Tree
 * a Node contains data and two pointers, one to the left child of that node and one to the right child of that node
 *
 * the constructor below takes the param data, which again, is the data inside the node.
 */
public class BinaryTreeNode {
    public int dataInsideThisNode;
    public BinaryTreeNode left, right;
    public BinaryTreeNode(int dataInsideThisNode){
        this.dataInsideThisNode=dataInsideThisNode;
        left=null;
        right=null;
    }

    /** The code below is all just simple setters and getters*/

    public int getDataInsideThisNode(){
        return dataInsideThisNode;
    }

    public void setDataInsideThisNode(int dataInsideThisNode){
        this.dataInsideThisNode=dataInsideThisNode;
    }

    public BinaryTreeNode getLeft(){
        return left;
    }

    public BinaryTreeNode getRight(){
        return right;
    }

    public void setLeft(BinaryTreeNode left){
        this.left=left;
    }

    public void setRight(BinaryTreeNode right){
        this.right=right;
    }
}
