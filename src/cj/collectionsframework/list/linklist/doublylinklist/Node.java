package cj.collectionsframework.list.linklist.doublylinklist;

public class Node {
    Node prev;
    int data;
    Node next;

    public Node(Node prev, int data,Node next){
        this.data=data;
        prev=null;
        next=null;
    }

}
