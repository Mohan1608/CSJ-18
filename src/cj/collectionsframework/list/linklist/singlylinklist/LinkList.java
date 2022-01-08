package cj.collectionsframework.list.linklist.singlylinklist;

public class LinkList {
    int size;
    Node start;
    Node end;

    public LinkList() {
        size = 0;
        start = null;
    }

    public int getSize() {
        return size;
       /* System.out.println(size)*/
    }
    public void isEmpty() {
        if (size == 0) {
            System.out.println("empty");
        } else{
            System.out.println(" not empty");
        }
    }

    public void insertAtFirst(int val) {
        Node n;
        n = new Node(val);
        n.data = val;
        n.next = start;
        start = n;
        size++;
    }

    public void insertAtLast(int val) {
       Node n;
        n = new Node(val);
        n.data = val;
        end = start;
        if (start == null) {
            start = n;
            return;
        }
        while (end.next != null) {
            end = end.next;
        }
        end.next = n;
        size++;
    }

    public void insertAtMid(int val, int pos) {
        if (pos == 1) {
            insertAtFirst(val);
        } else if (pos == size + 1) {
            insertAtLast(val);
        } else if ((pos > 1) && (pos <= size)) {
            Node n;
            Node t;
            n = new Node(val);
            t = start;
            System.out.println(t);
            for (int i = 1; i < pos-1 && t != null; i++) {
                System.out.println(t);
                t = t.next;
            }
            n.next = t.next;
            t.next = n;
            size++;

        } else {
            System.out.println("pls enter valid position");
        }

    }

    public void displayList() {
        Node t;
        if (start==null) {
            System.out.println("The list is Empty");
        } else {
            t = start;

            for (int i = 1; i <= size; i++) {
                System.out.print(" " + t.data);
                t = t.next;

            }
        }
    }

    public void deleteFirst(){
        Node t;
        t=start;
        if (t==null){
            System.out.println("The linked list is empty");
        }
        /*else if (t.next==null){
            t=null;
            start=t;
            // we did not write this because below logic is same as this logic when link contain only 1 element
        }*/
        else {
            t=t.next;
            start=t;
        }
        size--;
    }

    public void deleteLast(){
        Node t;
        t=start;
        for(int i=1;i<size;i++){
            t=t.next;
        }
        t.next=null;
        size--;


    }

    public void deleteMid(int pos){
        Node t;
        Node ptr;
        t=start;
        ptr=t.next;
        if (pos==1){
            deleteFirst();
        }
        for (int i = 1; i <pos-1 ; i++) {
            t=t.next;
            ptr=t.next;
        }
        t.next=ptr.next;
        size--;
    }
}
