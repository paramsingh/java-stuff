public class List {
    Node start;
    List(){
        start = null;
    }
    List(Node a){
        start = a;
    }
    public void insertBeg(int c){
        // insert a Node into the beginning of the list
        Node nptr= new Node(c);
        if( start==null ) {
            start = nptr;
        }
        else {
            nptr.link=start;
            start = nptr;
        }
    }
    public void insertEnd(int c){
        // insert a node in the end of the list
        Node nptr = new Node(c);
        if(start == null) {
            start=nptr;
        }
        else {
            Node ptr = start;
            while( ptr.link!=null )
                ptr=ptr.link;
            ptr.link=nptr;
        }
    }
    public void insertMiddle( int c, int pos ){
        Node nptr= new Node(c);
        if(start==null)
            start = nptr;
        else{
            Node ptr = start,prev = start;
            int count = 1;
            while( ptr!=null && count<=pos ){
                prev=ptr;
                ptr=ptr.link;
                count++;
            }
            if( ptr==null )
                System.out.println("Position not present in list");
            else{
                prev.link=nptr;
                nptr.link=ptr;
            }
        }
    }
    public void createSortedList( int x ){
        Node nptr= new Node(x);
        if( start==null )
            start = nptr;
        else if(x<start.val){
            nptr.link=start;
            start = nptr;
        }
        else{
            Node ptr=start,prev=start;
            while( ptr!=null && x>ptr.val ){
                prev=ptr;
                ptr=ptr.link;
            }
            prev.link=nptr;
            nptr.link=ptr;
        }
    }
    public void deletePosition(int pos){
        if(pos==1)
            start=start.link;
        else{
            Node ptr=start,prev=start;
            int count=1;
            while(ptr!=null && count<=pos){
                prev=ptr;
                ptr=ptr.link;
                count++;
            }
            if(ptr==null)
                System.out.println("Position not present in list");
            else{
                prev.link=ptr.link;
            }
        }
    }
    public void deleteValue(int x){
        if(start.val==x)
            start=start.link;
        else{
            Node ptr =start, prev=start;
            while(ptr!=null && ptr.val!=x){
                prev=ptr;
                ptr=ptr.link;
            }
            if(ptr==null)
                System.out.println("Value not found");
            else
                prev.link=ptr.link;
        }
    }
    public void display(){
        Node ptr=start;
        while(ptr!=null){
            System.out.print(ptr.val+"--->");
            ptr=ptr.link;
        }
    }
    public void concat(List a, List b){
        Node ptr= a.start;
        while(ptr.link!=null)
            ptr=ptr.link;
        ptr.link=b.start;
    }
    public void split( List a,List b,int pos){
        int c=1;
        Node ptr=a.start,prev=start;
        while(ptr!=null && c<pos){
            prev=ptr;
            ptr=ptr.link;
            c++;
        }
        if(ptr==null)
            System.out.println("Position not present in list");
        else{
            prev.link=null;
            b.start=ptr;
        }
    }
}
