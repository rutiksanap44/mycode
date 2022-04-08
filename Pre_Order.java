package Binary_Trees;

import Binary_Trees.BinaryTreeNode;

import java.util.Scanner;

public class Pre_Order {
    public static void preOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return ;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
        // for the connection of rootLeft and rootRight with  parent root that is root.
        root.left=rootLeft;
        root.right=rootRight;

        //to make new sub-roots of rootLeft and rootRight.
        BinaryTreeNode<Integer> rootLeftLeft = new BinaryTreeNode<Integer>(4);
        BinaryTreeNode<Integer> rootRightRight = new BinaryTreeNode<Integer>(5);
        rootLeft.left=rootLeftLeft;
        rootRight.right=rootRightRight;
        preOrder(root);
    }
}
