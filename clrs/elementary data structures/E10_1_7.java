/**
 * Stack using 2 queues
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

    int dequeue(){
        if(isEmpty()){
            System.out.print("Underflow ");
            return -999;
        }
        else{
            if(head==queue.length)
                head=0;
            int del = queue[head];
            head=head+1;
            
            if(head==tail)
                head=tail=0;
            return del;
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

class Stack_from_Queue{
    Queue a = new Queue();
    Queue b = new Queue();
    
    void push(int item){
        a.enqueue(item);
    }

    void pop(){
        while(!a.isEmpty())
            b.enqueue(a.dequeue());
        System.out.println("deleted: "+ b.dequeue());
        while(!b.isEmpty())
            a.enqueue(b.dequeue());
    }
}

class E10_1_7{
    public static void main(String[] args){
        Stack_from_Queue s = new Stack_from_Queue();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.pop();
        s.push(10);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}