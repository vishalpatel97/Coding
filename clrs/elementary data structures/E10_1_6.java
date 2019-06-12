/**
 * queue using two stacks
 * enqueue: O(1)
 * dequeue: O(n)  amortised: O(1)
 */

class Stack1{
    int stack[] = new int[5];
    int top = -1;

    boolean isEmpty(){
        if(top==-1)
           return true;
        else
            return false; 
    }

    boolean isFull(){
        if(top!=stack.length-1)
            return false;
        else
            return true;
    }

    void push(int x){
        if(!isFull()){
            top = top+1;
            stack[top] = x;
        }
        else
            System.out.println("Overflow");
    }

    int pop(){
        if(isEmpty()){
            System.out.print("Underflow");
            return -999;
        }else{
            top = top-1;
            return stack[top+1];
        }
    }

    void display(){
        for (int i=0;i<=top; ++i)
            System.out.print(stack[i] + " ");    
        System.out.println();
    }
}

class Queue_from_Stack{
    Stack1 a = new Stack1();
    Stack1 b = new Stack1();

    void enqueue(int item){
            a.push(item);
    }

    void dequeue(){
        while(!a.isEmpty())
            b.push(a.pop());
        System.out.println("deleted "+b.pop());
        while(!b.isEmpty())
            a.push(b.pop());
    }
} 

class E10_1_6{
    public static void main(String[] args) {
        Queue_from_Stack q = new Queue_from_Stack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.dequeue();
        q.enqueue(10);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}