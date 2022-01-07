package cj.collectionsframework.list.linklist.doublylinklist;

public class DoblyList {
    Node head;
    Node tail;
    int size=0;

    public void isEmpty(){
        if (size==0){
            System.out.println(" list is empty");
        }
        else{
            System.out.println(" list is empty");
        }
    }

    public void insertFirst(int val){
        Node n;
        if (size==0){
            n=new Node(null,val,null);
            n.data=val;
            head=n;
            tail=n;
        }
        else {
            n=new Node(null,val,head);
            n.data=val;
            n.next=head;
            n.prev=null;
            head=n;
        }
        size++;
    }

    public void insertLast(int val){
        Node n;
        if(size==0){
            insertFirst(val);
        }
        else{
           Node t=head;
           while (t.next!=null){
               t=t.next;
           }
           n= new Node(t,val,null);
           t.next=n;
           n.data=val;
           n.prev=t;

        }
        size++;
    }

    public void insertMid(int val,int pos){
        Node t;
        Node ptr;
        Node n;
        if (pos<=1){
            insertFirst(val);
        }
        else if (pos==size+1){
            insertLast(val);
        }
        else {
            t=head;
            ptr=t.next;
            n=new Node(t,val,ptr);
            for (int i =1; i <pos-1 ; i++) {
                t=t.next;
                ptr=ptr.next;
            }
            n.next=t.next;
            ptr.prev=n;
            t.next=n;
        }
        size++;
    }

    public void deleteFirst(){
        if (size==0){
            System.out.println("list is empty");
        }
        else{
            Node t;
            t=head;
            head=t.next;
        }
    }

    public void deleteLast(){
        Node t;
        Node ptr;
        t=head;
        ptr=t.next;
        while (ptr.next!=null){
            t=t.next;
            ptr=ptr.next;
        }
        t.next=null;
    }

    public void deleteMid(int pos){
        if (pos==1){
            deleteFirst();
        }
        else if (pos==size){
            deleteLast();
        }
        else{
            Node t;
            Node ptr;
            t=head;
            ptr=t.next;
            for (int i =1; i<pos-1;i++) {
                t=t.next;
                ptr=ptr.next;
            }
            t.next=ptr.next;

        }
    }

    public void displayList(){
        Node t;
        t=head;
        while (t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}
