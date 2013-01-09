class List {
    Node start;
    List(){
        start = null;
    }
    List(Node a){
        start = a;
    }
    void insertBeg(int n){
        Node ptr = new Node(n);
        if(start == null)
            start = ptr;
        else{
            ptr.link = start;
            start = ptr;
        }
    }
    void insertEnd(int n){
        Node ptr = new Node(n);
        if(start == null)
            start = ptr;
        else {
            Node a = start;
            while(a.link!=null)
                a=a.link;
            a.link = ptr;
        }
    }
    void insertMid(int x, int pos){
        Node ptr = new Node(x);
        if(pos==1)
            start = ptr;
        else {
            Node a = start;
            int count = 0;
            while(count<=pos){
                a = a.link;
                count++;
            }
            if( a == null )
                System.out.println("Position does not exist");
            else
                a.link = ptr;
        }
    }
    void delete(int x){
        if(start.val == x)
            start = start.link;
        else{
            Node a = start,prev = start;
            while(a.val!= x && a!=null){
                prev = a;
                a = a.link;
            }
            if( a==null )
                System.out.println("Value does not exist");
            else 
                prev.link = a.link;
        }
    }
    int search( int x ){
        int pos=0;
        if( start.val == x)
            pos = 1;
        else{
            Node ptr = start;
            while( ptr.val != x && ptr!=null){
                pos++;
                ptr = ptr.link;
            }
            if(ptr==null)
                pos = -1;
        }
        return pos;
    }
}
