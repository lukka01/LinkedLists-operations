public class List2 {

    private listNode head;


    private static class listNode {
        private int data;
        private listNode next;

        public listNode(int data){
            this.data = data;
            this.next = null;

        }
    }

    public void display(){
        listNode  current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        List2 list = new List2();

        list.head = new listNode(10);
        listNode second = new listNode(1);
        listNode third = new listNode(8);
        listNode fourth = new listNode(11);

        list.head.next = second;
        second.next = third;
        third.next= fourth;

        list.display();





    }


}
