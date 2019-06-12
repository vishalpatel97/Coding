class Stack{
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

    void pop(){
        if(isEmpty())
            System.out.println("Underflow");
        else{
            top = top-1;
            System.out.println("deleted " + stack[top+1]);
        }
    }

    void display(){
        for (int i=0;i<=top; ++i)
            System.out.print(stack[i] + " ");    
        System.out.println();
    }
}

class E10_1_1{
    
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(4);
        s.push(1);
        s.push(8);
        s.pop();

        s.display();
    }
}