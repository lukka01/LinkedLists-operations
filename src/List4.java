public class List4 {
    private listNode head;

    private static class listNode{
        private int data;
        private listNode next;
        listNode(int data){
            this.data = data;
            this.next = null;
        }

    }

//    private void display(){
//        listNode current = head;
//        while (current != null){
//            System.out.print(current.data + " --> ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }

    private void display(){
        listNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

//    private int  getLength() {
//        if(head == null) return 0;
//        int count = 0;
//        listNode current = head;
//        while(current != null){
//            count++;
//            current = current.next;
//        }
//        System.out.println(count);
//        return count;
//    }

    private int getLength(){
        if(head == null) return 0;
        int count = 0;
        listNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        System.out.println(count);
        return count;
    }

//    public void insertFirst(int value){
//        listNode newNode = new listNode(value);
//        newNode.next = head;
//        head = newNode;
//    }

//    public void insertFirsrt(int value){
//        listNode newNode = new listNode(value);
//        newNode.next =head;
//        head = newNode;
//    }
//    public void insertFirst(int value){
//        listNode node = new listNode(value);
//        node.next = head;
//        head = node;
//    }
    public void inserFirst(int value){
        listNode newnode  = new listNode(value);
        newnode.next = head;
        head= newnode;
    }



//    public void insertLast(int value){
//        listNode newNode = new listNode(value);
//        if(head ==null){
//            head = newNode;
//            return;
//        }
//        listNode current = head;
//        while(current.next != null){
//            current = current.next;
//        }
//        current.next = newNode;
//
//    }


//    public void insertLast(int value ){
//        listNode newNode = new listNode(value);
//
//        if(head == null){
//            head = newNode;
//            return;
//        }
//        listNode current = head;
//        while(current.next != null){
//            current = current.next;
//        }
//        current.next = newNode;
//
//    }

    public void insertLast(int value) {
        //1 --> 2 --> 3 --> 4
        //1 --> 2 --> 3
        listNode lastNode = new listNode(value);
        listNode current = head;

        if(head == null){
            head.next =  lastNode;
        }

        while(current.next != null){
            current = current.next;
        }

        current.next = lastNode;


    }

//    public void insert(int  position, int value){
//        listNode node = new listNode(value);
//
//        if (position == 1){
//            node.next = head;
//            head = node;
//        } else {
//            listNode previos = head;
//            int count = 1;
//
//            while(count < position-1){
//                previos = previos.next;
//                count++;
//
//            }
//            listNode current = previos.next;
//            previos.next = node;
//            node.next = current;
//
//        }
//
//    }

//    public void insert(int position, int value){
//        // 1 --> 2 --> 4
//        //1 --> 2 --> 3 --> 4
//        listNode node = new listNode(value);
//        if (position == 1){
//            node.next = head;
//            head = node;
//        }else{
//            listNode previous = head;
//            int count = 1;
//            while(count < position-1 ){
//                previous = previous.next;
//                count++;
//            }
//            listNode current = previous.next;
//            previous.next = node;
//            node.next = current;
//        }
//    }


//    public void insert(int value, int position){
//        // 1 --> 2 --> 4
//        //1 --> 2 --> 3 --> 4
//        listNode node = new listNode(value);
//        if(position == 1){
//            node.next = head;
//            head = node;
//        } else {
//            listNode previous = head;
//            int count = 1;
//            while(count < position-1 ){
//                previous = previous.next;
//                count++;
//            }
//            listNode current = previous.next;
//            previous.next = node;
//            node.next = current;
//        }
//
//    }
    public void insert(int position, int value){
        listNode newnode = new listNode(value);
        if(position ==1){
            newnode.next = head;
            head = newnode;
        } else {
            int count = 0;
            listNode previous = head;
            while (count < position-1){
                previous = previous.next;
                count ++;
            }

            listNode current = previous.next;
            previous.next = newnode;
            newnode.next = current;

        }



    }





//    public listNode deleteFirst(){
//        if (head == null){
//            return  null;
//        }
//
//        listNode temp = head;
//        head = head.next;
//        temp.next = null;
//        return temp;
//
//
//
//    }

    public listNode delerteFirst(){
        if ( head == null){
            return null;
        }
        listNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;

    }


//    public listNode deleteLast() {
//        if (head == null || head.next == null){
//            return head;
//        }
//        listNode current = head;
//        listNode previous = null;
//
//        while(current.next != null){
//            previous = current;
//            current = current.next;
//
//        }
//        previous.next = null;
//        return current;
//
//    }

    public listNode deletelast(){
        if (head == null || head.next == null) return head;
        listNode current = head;
        listNode previous = null;

        while(current.next != null){
            previous = current;
            current = current.next;
        }

        previous.next = null;
        return current;
    }


//    public void delete(int position){
//        // 1 --> 2 --> 3 --> 4
//        // 1 --> 2 --> 4
//
//        if (position == 1){
//            head = head.next;
//        } else {
//            listNode previous = head;
//            int count = 1;
//            while(count < position-1 ){
//                previous = previous.next;
//                count++;
//            }
//            listNode current = previous.next;
//            previous.next = current.next;
//        }
//
//    }

    public void delete(int position){
        if(position == 1){
            head = head.next;
        } else{
            int count = 1;
            listNode previous = head;
            while(count < position -1){
                previous = previous.next;
                count++;
            }
            listNode current = previous.next;
            previous.next = current.next;
        }
    }



//    public void deleteNode (int key){

 //     //1 --> 2 --> 3 --> 4
 //     //1 --> 2 --> 4
//        listNode current = head;
//        listNode  temp = null;
//
//        if (current != null && current.data == key) {
//            head = current.next;
//            return;
//
//        }
//
//        while (current != null && current.data != key){
//            temp = current;
//            current = current.next;
//        }
//        if(current == null){
//            return;
//        }
//
//        temp.next = current.next;
//
//
//    }

//    public void dleteNode(int key){
//        listNode current = head;
//        listNode temp = null;
//        if(current != null && current.data == key){
//            head = head.next;
//            return;
//        }
//        while(current != null && current.data != key){
//            temp = current;
//            current = current.next;
//        }
//        if(current == null){
//            return;
//        }
//        temp.next  = current.next;
//
//
//
//
//    }

    public void deleteNode(int key){
        listNode current = head;
        listNode temp = null;

        if(current != null && current.data == key){
            head = head.next;
            return;
        }

        while(current != null && current.data != key){
            temp = current;
            current = current.next;
        }
        if(current == null){
            return;
        }

        temp.next = current.next;
    }


    public void deleteKey(int key){
        // 1 --> 2 --> 3 --> 4
        // 1 --> 2 --> 4
        listNode current = head;
        listNode temp = null;

        if (current != null && current.data == key){
            head = current.next;
            return;
        }

        while(current != null && current.data != key){
             temp = current;
             current = current.next;
        }

        if(current == null) return;
        temp.next = current.next;
    }

//    public boolean findNode(int key){
//        listNode current = head;
//        while(current != null){
//            if(current.data == key){
//                return true;
//            }
//            current = current.next;
//        }
//        return false;
//    }


//     public boolean findNode(int key){
//        listNode current = head;
//
//        while (current != null){
//            if(current.data == key){
//                return true;
//            }
//            current = current.next;
//        }
//
//        return false;
//     }

    public boolean findNode(int key){
        listNode current = head;
        while(current != null){
            if(current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }


//    public listNode insertInSortedList(int value) {
//
//        // 1 --> 2 --> 3 --> 4
//        // 1 --> 2 --> 4
//        listNode newNode = new listNode(value);
//
//        if (head == null) {
//            return newNode;
//        }
//
//        listNode current = head;
//        listNode temp = null;
//
//        while (current != null && current.data < newNode.data) {
//            temp = current;
//            current = current.next;
//        }
//
//        newNode.next = current;
//        temp.next = newNode;
//
//        return head;
//    }


    public listNode insertInSortedList(int value){
        listNode newNode  = new listNode(value);

        listNode current = head;
        listNode temp = null;

        if(head == null){
            return  newNode;
        }

        while(current != null && current.data < newNode.data ){
            temp = current;
            current = current.next;
        }

        newNode.next = current;
        current.next = newNode;


        return head;
    }


    public boolean containsLoop(){
        listNode fastNegga = head;
        listNode slowNegga = head;

        while(fastNegga != null && fastNegga.next != null){
            fastNegga = fastNegga.next.next;
            slowNegga = slowNegga.next;
        }

        if (fastNegga == slowNegga) {
            return true;
        }

        return  false;

    }

//    public listNode removeElements(listNode head, int val) {
//        if ( head == null) return null;
//        while(head != null && head.data == val) head = head.next;
//        listNode temp = head;
//        while(temp != null && temp.next != null){
//            if(temp.next.data == val){
//                temp.next = temp.next.next;
//            }else{
//                temp = temp.next;
//            }
//        }
//        return head;
//
//    }








    public static void main(String[] args) {
        List4 list = new List4();

        list.head = new listNode(2);
        listNode second = new listNode(4);
        listNode third = new listNode(8);
        listNode fourth = new listNode(16);

        list.head.next = second;
        second.next = third;
        third.next = fourth;

//        list.insertFirst(3);
//        list.insertLast(5);

//        list.insert(3,7);
//        list.deleteFirst();

        list.insert(7,3);
//        list.delete(3);
        list.display();
        list.getLength();
    }


}
