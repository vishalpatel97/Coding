import javax.lang.model.util.ElementScanner6;

/**
 * Implement 2 stack in an array[1..n] such that neither stack overflows unless the total
 * number of elements in both stacks together is n
 */
class ArrayWith2Stacks{
    int[] stack = new int[6];
    int top1 = -1;
    int top2 = stack.length;
    
    boolean isEmpty(){
        if(top1==-1 && top2==stack.length)
            return true;
        else
            return false;
    }

    boolean isFull(){
        if(top1+1 == top2)
            return true;
        else
            return false; 
    }

    void push(char s, int item){
        if(isFull())
            System.out.println("push unsuccessful.. Overflow");
        else{
            if(s=='1'){
                top1=top1+1;
                stack[top1]=item;
            }else if(s=='2'){
                top2=top2-1;
                stack[top2]=item;
            }
        }
    }

    void pop(char s){
        if(isEmpty())
            System.out.println("Underflow");
        else{
            if(s=='1'){
                top1 = top1-1;
                System.out.println("deleted " + stack[top1+1]);
            }else if(s == '2'){
                top2 = top2+1;
                System.out.println("deleted " + stack[top2-1]);
            }
        }
    }
    void display(){
        System.out.print("Stack1: ");
        for(int i=0;i<=top1;++i)
            System.out.print(stack[i]+" ");
        System.out.print("Stack2: ");
        for(int i=stack.length-1;i>=top2;--i)
            System.out.print(stack[i]+" ");
        System.out.println();
    }
}

class E10_1_2{
    public static void main(String[] args) {
        ArrayWith2Stacks stack_2 = new ArrayWith2Stacks();
        stack_2.pop('2');
        stack_2.push('1', 1);
        stack_2.push('1', 2);
        stack_2.push('2', 9);
        stack_2.push('2', 8);
        stack_2.push('2', 7);
        stack_2.push('2', 6);
        stack_2.display();
        stack_2.push('2', 5);
        stack_2.pop('2');
        stack_2.push('1', 4);
        stack_2.display();
    }
}