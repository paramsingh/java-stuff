public class Node
{
    int val;
    Node link;
    public Node(){
        val=0;
        link = null;
    }
    public Node(int x,Node y){
        val=x;
        link=y;
    }
    public Node(int x){
        val=x;
        link=null;
    }
}

