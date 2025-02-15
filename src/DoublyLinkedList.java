import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private listNode head;
    private listNode tail;
    private int length;


    private class listNode{
        private int data;
        private listNode next;
        private listNode previous;
        public listNode(int data){
            this.data = data;
        }

    }

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }
    public int length(){
        return length;
    }

//    public void insertLast(int value){
//
//        listNode newNode =new listNode(value);
//        if(isEmpty()){
//            head = newNode;
//        } else {
//          tail.next = newNode;
//        }
//        newNode.previous = tail;
//        tail = newNode;
//        length++;
//    }

    public void insertFirst(int value){
        listNode newNode = new listNode(value);

        if(isEmpty()){
            tail = newNode;
        } else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length ++;

    }

    public void insertLast(int value){
        listNode newNode = new listNode(value);

        if(isEmpty()){
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;

        }
        tail = newNode;
        length++;

    }

//    public listNode deleteFirst(){
//        if (isEmpty()){
//            throw new NoSuchElementException();
//        }
//
//        listNode temp = head;
//
//        if ( head == tail){
//            tail = null;
//        } else {
//            head.next.previous = null;
//        }
//        head = head.next;
//        temp.next = null;
//        length--;
//        return temp;
//
//    }

    public listNode deletFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        listNode temp = head;
        if(head == tail){
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length --;
        return temp;
    }

    public listNode deleteLast(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }

        listNode temp = tail;
        if(head == tail){
           head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }


    public void displayForward(){
        if(head == null){
            return;
        }

        listNode temp = head;
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackWard(){
        if (tail == null){
            return;
        }
        listNode temp = tail;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(14);
        dll.insertFirst(15);
        dll.insertFirst(16);
        dll.deleteLast();
        dll.displayForward();
//        dll.displayBackWard();

    }




}
