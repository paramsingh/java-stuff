public class Stack {
    int st[], size, top;
    Stack(){
        st = null;
        size = 0;
        top = 0;
    }
    Stack(int n){
        size = n;
        st = new int[size];
        top = 0;
    }
    void push(int val) {
        if( top == size-1) //if the stack is full 
            System.out.println("Stack is full");
        else {
            //increase the value of top along with pushing the number
            st[++top] = val;
        }
    }
    void pop(){
        if(top==-1) // if stack is empty
            System.out.println("Stack is empty");
        else {
            a[top--]=0;
        }
    }
    void display(){
        if(top==-1)
            System.out.println("Stack is empty");
        else{
            for(int i = top-1; i>=0;i--)
                System.out.println(st[i]);
        }
    }
}
