public class Queue {
    int q[], size, front, rear;
    Queue(){
        size = 0;
        q = null;
        front = rear = -1;
    }
    Queue(int s){
        size = s;
        q = new int[s];
        front = rear = -1;
    }
    void insert( int val ) {
        if(rear == size -1) // queue is full
            System.out.println("Queue's full, idiot");
        else {
            q[++rear] = val;
            if( front == -1)
                front = 0;
        }
    }
    void insertFront(int val) {
        if(front ==0)
            System.out.println("Queue's full, idiot");
        else {
            if(front == -1)
                front = rear = 0;
            else 
                front --;
            q[front] = val;
        }
    }
    void deleteRear(){
        if(front == -1)
            System.out.println("Queue's empty");
        else{
            q[rear]=0;
            if(front == rear)
                front = rear = -1;
            else
                rear --;
        }
    }
    void delete(){
        if(front == -1) // queue is empty
            System.out.println("Queue's empty, idiot.");
        else {
            q[front] = 0;
            if( front == rear )
                front = rear = -1;
            else
                front --;
        }
    }
    void display() {
        if(front == -1){
            System.out.println("Empty queue");
        }
        else {
            for ( int i=front; i<=rear; i++)
                System.out.println(q[i]);
        }
    }
}
