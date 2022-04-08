package Binary_Trees;

import java.util.Scanner;

public class BTN_User_Input {
    public static int i=0;
    public static BinaryTreeNode<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();
        if(rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
        System.out.println("Enter Left Child");
        BinaryTreeNode<Integer> leftroot=takeInput();
        System.out.println("Enter Right Child");
        BinaryTreeNode<Integer> rightroot=takeInput();
        root.left=leftroot;
        root.right=rightroot;
        return root;
    }

    public static void printDetailed(BinaryTreeNode<Integer> root)
    {
        if(root==null){
            return;
        }
        System.out.print(root.data + " : ");
        if(root.left!=null){
            System.out.print(" L" + root.left.data + " , ");
        }
        if(root.right!=null){
            System.out.print(" R" + root.right.data );
        }
        System.out.println();
        printDetailed(root.left);
        printDetailed(root.right);
    }

    public static void main(String[] args) {
       BinaryTreeNode<Integer> root = takeInput();
        printDetailed(root);
    }
}
