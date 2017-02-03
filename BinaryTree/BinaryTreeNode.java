/**
 * Created by Mohammed M Khan on 2/2/2017.
 */
public class BinaryTreeNode {
    public int dataInsideThisNode;
    public BinaryTreeNode left, right;
    public BinaryTreeNode(int dataInsideThisNode){
        this.dataInsideThisNode=dataInsideThisNode;
        left=null;
        right=null;
    }

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
