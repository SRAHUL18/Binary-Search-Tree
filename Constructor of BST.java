import java.io.*;
import java.util.*;
public class Main
{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(){
            
        }
        Node(int data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
        
    }
    public static Node construct(int[] arr,int low,int high){
        if(low>high){
            return null;
        }
        int mid = (low + high )/2;
        int data=arr[mid];
        Node lc=construct(arr,low,mid-1);
        Node rc=construct(arr,mid+1,high);
        Node node=new Node(data,lc,rc);
        return node;
        
    }
    
    public static void display(Node node) {
        if(node==null){
            return;
        }
        String res="";
        if(node.left!=null){
            res+=node.left.data +" <- " + node.data; 
        }
        else{
            res+=". "+"<- "+node.data;
        }
        if(node.right!=null){
            res+= " -> "+node.right.data;
        }
        else{
            res+=" ->"+" .";
        }
        System.out.println(res);
        display(node.left);
        display(node.right);
    }
    
   public static void Main(String[] args){
       int[] arr={12,25,37,50,62,75,87};
       Node root=construct(arr,0,arr.length-1);
       
       display(root);
       
   }
    
}
