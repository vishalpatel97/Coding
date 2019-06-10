/**
 * circular queue
 */
class Queue{
    int[] queue = new int[5];
    int head=0;
    int tail=0;

    boolean isEmpty(){
        if(head == tail && head==0)
            return true;
        else
            return false;
    }

    boolean isFull(){
        if(head==tail+1 || (head==0 && tail==queue.length))
            return true;
        else
            return false;
    }

    void enqueue(int item){
        if(!isFull()){
            if(tail==queue.length)
                tail=0;
            queue[tail]=item;
            tail=tail+1;
        }else{
            System.out.println("Overflow");
        }
    }

    void dequeue(){
        if(isEmpty())
            System.out.println("Underflow");
        else{
            if(head==queue.length)
                head=0;
            int del = queue[head];
            head=head+1;
            
            if(head==tail)
                head=tail=0;
            System.out.println("deleted: " + del);
        }
    }

    void display(){
        int i=head;
        while(i<queue.length || i<=tail){
            System.out.print(queue[i]+" ");
            i++;
        }       
       
        //if head is greater than  tail then above loop will stop when i reaches the array's end   
        if(tail<=head){
            i=0;
            while(i<=tail){
                System.out.print(queue[i]+" ");
                i++;
            }
        }
        System.out.println();
    }
}

class E10_1_3{
    public static void main(String[] args){
        Queue q=new Queue();
        q.dequeue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.dequeue();
        q.enqueue(10);
        // for(int i=0;i<5;++i)
            // System.out.print("qq"+q.tail+"qq ");
        q.display();

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}