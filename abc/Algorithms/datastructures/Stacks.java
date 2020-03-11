package abc.Algorithms.datastructures;


public class Stacks{
    
    static int ponteiro;
    static int[] stack;
    
    public static void main(String[] args) {
        createStack(500);
        System.out.println("Stack created!");
        System.out.println("Size: "+size());
        System.out.println("Push: "+push(5));
        System.out.println("Pop " + pop());
        System.out.println("isEmpty: "+isEmpty());
    }

    public static void createStack(int N){
        ponteiro=0;
        stack = new int[N];
    }

    public static int push(int n){
        if(ponteiro < stack.length){
            stack[ponteiro]=n;
            ponteiro++;
            return 1;
        }
        return 0;
    }

    public static int pop(){
        if(!isEmpty()){
            return stack[ponteiro--];
        }
        return -1;
    }

    public static boolean isEmpty(){
        if(ponteiro == -1)
            return true;
        return false;
    }

    public static int size(){
        return stack.length;
    }
}