class Deque{
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
        if(head==tail+1 ||(head==0 && tail==queue.length))
            return true;
        else
            return false;
    }

    void enqueueHead(int item){
        if(!isFull()){
            head=head-1;
            if(head==-1)
                head=queue.length-1;
            queue[head]=item;
        }else{
            System.out.println("Overflow");
        }
    }

    void enqueueTail(int item){
        if(!isFull()){
            if(tail==queue.length)
                tail=0;
            queue[tail]=item;
            tail=tail+1;
        }else{
            System.out.println("Overflow");
        }
    }

    void dequeueHead(){
        if(!isEmpty()){
            int del = queue[head];
            head=head+1;
            if(head==tail+1 || head==queue.length)
                head=0;
            System.out.println("deleted: "+del);
        }else{
            System.out.println("Underflow");
        }
    }

    void dequeueTail(){
        if(!isEmpty()){
            if(tail==queue.length)
                tail=tail-1;
            int del=queue[tail];
            tail=tail-1;
            System.out.println("aaa");
            if(tail==-1)
                tail=queue.length-1;
            if(tail==head-1)
                tail=0;
            System.out.println("deleted: "+del);
        }else
            System.out.println("Underflow");
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

class E10_1_5{
    public static void main(String[] args) {
        Deque dq = new Deque();
        dq.dequeueHead();
        dq.enqueueTail(1);
        dq.enqueueTail(2);
        dq.enqueueTail(3);
        dq.enqueueTail(4);
        dq.enqueueTail(5);
        dq.enqueueTail(6);
        dq.dequeueTail();
        dq.enqueueHead(-1);
        dq.display();
    }
}