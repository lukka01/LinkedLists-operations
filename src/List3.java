public class List3 {

    private listNode head;

    private static class listNode{
        private int data;
        private listNode next;

        listNode(int data) {
            this.data = data;
            this.next = null;
        }


    }

    public  void display(){
        listNode current = head;
        while(current != null) {
            System.out.print(current.data + " --> " );
            current = current.next;
        }
        System.out.println("null");
    }


    public int findLength(){
        if(head == null) return 0;
        int count = 0;
        listNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        List3 leaf = new List3();
        leaf.head = new listNode(14);
        listNode second = new listNode(5);
        listNode third = new listNode(3);

        leaf.head.next = second;
        second.next = third;

        leaf.display();
        leaf.findLength();

    }

}
