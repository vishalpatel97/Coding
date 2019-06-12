/**
 * stack using linked list
 */

 class Node{
     int data;
     Node next;
 }

 class Stack{
    Node top=null;

    void push(int item){
        Node temp=null;
        try{
            temp=new Node();
            temp.data=item;
            temp.next=top;
            top=temp;
        }catch(Exception ex){
            System.out.println("unsuccessful push");
        }
    }

    int pop(){
        if(top!=null){
            int del = top.data;
            top=top.next;
            return del;
        }else
            return -999;
    }
 }

 class E10_2_2{
     public static void main(String[] args){
         Stack s=new Stack();
         System.out.println(s.pop());
         s.push(1);
         s.push(2);
         s.push(3);
         s.push(4);
         System.out.println(s.pop());
         System.out.println(s.pop());
         s.push(5);
         System.out.println(s.pop());
         System.out.println(s.pop());
         System.out.println(s.pop());
         System.out.println(s.pop());
     }
 }