package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Print_Tree_Level_Wise_Simple {
    public static void printLevelWise(BinaryTreeNode<Integer> root){
        if(root == null){
            return ;
        }
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            BinaryTreeNode<Integer> newNode = q.remove();
            if(newNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(newNode.data+" ");
                if(newNode.left!=null){
                    q.add(newNode.left);
                }
                if(newNode.right!=null){
                    q.add(newNode.right);
                }
            }
        }
    }
    public static BinaryTreeNode<Integer> LevelWiseInput(){
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChild = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChild.add(root);

        while(!pendingChild.isEmpty()){
            BinaryTreeNode<Integer> front = pendingChild.poll();
            System.out.println("Enter th left child of " + front.data);
            int left = s.nextInt();
            if(left !=-1){
                BinaryTreeNode<Integer> leftchild = new BinaryTreeNode<Integer>(left);
                front.left = leftchild;
                pendingChild.add(leftchild);
            }

            System.out.println("Enter the right child of " + front.data);
            int right = s.nextInt();
            if(right !=-1){
                BinaryTreeNode<Integer> rightchild = new BinaryTreeNode<Integer>(right);
                front.right=rightchild;
                pendingChild.add(rightchild);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = LevelWiseInput();
        printLevelWise(root);
    }
}
