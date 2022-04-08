package Binary_Trees;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Print_Tree_Level_Wise {
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
                System.out.print(newNode.data+":");
                if(newNode.left!=null){
                    System.out.print("L:"+newNode.left.data+",");
                    q.add(newNode.left);
                }
                if(newNode.left==null){
                    System.out.print("L:-1,");
                }
                if(newNode.right==null){
                    System.out.println("R:-1");
                }
                if(newNode.right!=null){
                    System.out.println("R:"+newNode.right.data);
                    q.add(newNode.right);
                }
            }
        }
    }
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

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput();
        printLevelWise(root);
    }
}
