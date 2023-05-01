//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to delete middle element of a stack.
    int deleteIndexElement=0;
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        int stkSize=s.size()+1;
        deleteIndexElement=stkSize%2==0?stkSize/2:stkSize/2+1;
        deleteMidEle(s,deleteIndexElement);
        
    } 
    
    public void deleteMidEle(Stack<Integer> stk,int size){
        //if(deleteIndexElement==size){
        if(size==1){
            stk.pop();
            return;
        }
        else{
            int lastElement=stk.pop();
            deleteMidEle(stk,size-1);
            stk.push(lastElement);
        }
    }
}

