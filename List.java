public class List {
    Node start;
    List() {
        start = null;
    }
    List(Node a) {
        start = a;
    }
    void insertBeg( int a ) {
        Node ptr = new Node(a);
        if( start == null ) {
            start = ptr;
        }
        else {
            ptr.link = start;
            start = ptr;
        }
    }
    void insertEnd( int a ) {
        Node ptr = new Node(a);
        if(start == null ) {
            start = ptr;
        }
        else {
            Node nptr = start;
            while(nptr.link!=null){
                nptr = nptr.link;
            }
            nptr.link = ptr;
        }
    }
    void insertAtPos( int a, int pos ) {
        Node ptr = new Node(a);
        if( pos == 1 )
            start = ptr;
        else {
            Node nptr = start;
            Node prev = start;
            int count = 1;
            while( nptr!=null && count<pos){
                prev = nptr;
                nptr = nptr.link;
                count++;
            }
            if(nptr == null)
                System.out.println("Position not present");
            else {
                prev.link = ptr;
                ptr.link = nptr;
            }
        }
    }
    void insertSorted(int x) {
        Node ptr = new Node(x);
        if(start == null){
            start = ptr;
        }
        else if( x<start.val) {
            ptr.link = start;
            start = ptr;
        }
        else {
            Node nptr = start;
            Node prev = start;
            while( nptr!=null && x>nptr.val ){
                prev = nptr;
                nptr = nptr.link;
            }
            prev.link = ptr;
            ptr.link = nptr;
        }
    }
    void deleteVal(int x) {
        Node ptr = new Node(x);
        if(start.val == x){
            start = start.link;
        }
        else {
            Node nptr, prev;
            nptr = prev = start;
            while(nptr!=null && nptr.val != x) {
                prev = nptr;
                nptr = nptr.link;
            }
            if(nptr == null )
                System.out.println("Value not present");
            else{
                prev.link = nptr.link;
            }
        }
    }
    void deletePos(int pos){
        if(pos==1)
            start = start.link;
        else{
            Node nptr, prev;
            nptr = prev =start;
            int count = 1;
            while(nptr!=null && count < pos){
                prev = nptr;
                nptr = nptr.link;
                count ++;
            }
            if(nptr == null)
                System.out.println("Position not present");
            else
                prev.link = nptr.link;
        }
    }
    void display(){
        Node ptr = start;
        while(ptr != null){
            System.out.println(ptr.val+";");
            ptr = ptr.link;
        }
    }
    int search(int a){
        int pos = -1;
        if(start.val == a){
            pos = 1;
        }
        else{
            Node ptr = start;
            int count =1;
            while(ptr!=null){
                if(ptr.val == a){
                    pos = count;
                    break;
                }
                ptr = ptr.link;
                count ++;
            }
        }
        return pos;
    }
    void concat(List a, List b){
        Node ptr = a.start;
        while(ptr.link!=null)
            ptr= ptr.link;
        ptr.link = b.start;
    }
    void split( List m, List n, int pos){
        Node ptr = m.start;
        int count =1;
        Node prev = new Node();
        while( ptr!=null && count<pos){
            count++;
            prev= ptr;
            ptr =ptr.link;
        }
        if(ptr==null)
            System.out.println("Position not present");
        else {
            prev.link = null;
            n.start = ptr;
        }
    }
    void reverse(List m){
        Node ptr = start;
        while(ptr!=null){
            Node nptr = new Node(ptr.val);
            if(m.start == null){
                nptr.link = null;
            }
            else{
                nptr.link = m.start;
                m.start = nptr.link;
            }
            ptr = ptr.link;
        }
    }
}
