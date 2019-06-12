/**
 * Queue using linked list
 */

 class Queue{
     Node head=null;
     Node tail=null;

     void enqueue(int item){
         try{
             Node temp=new Node();
             temp.data=item;
             if(tail==null)
                head=tail=temp;
             else{
                 tail.next=temp;
                 tail=temp;
             }
         }catch(Exception ex){
             System.out.println("Unsuccessfull enqueue");
         }
     }

     int dequeue(){
         if(head==null) //underflow
            return -999;
        else{
            Node temp=head;
            int del = temp.data;
            head = temp.next;
            temp=null;
            return del;
        }
     }
 }

 class E10_2_3{
     public static void main(String[] args) {
        Queue q=new Queue(); 
        System.out.println(q.dequeue());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.dequeue());
        q.enqueue(5);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
     }
 }