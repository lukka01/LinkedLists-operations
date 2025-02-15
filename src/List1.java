public class List1 {
    private listNode head;

    private static class listNode {
        private int data;
        private listNode next;

        public listNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        List1 list = new List1();
        list.head = new listNode(10);
        listNode second = new listNode(1);
        listNode third = new listNode(8);
        listNode fourth = new listNode(11);

        list.head.next = second;
        second.next = third;
        third.next = fourth;







    }




}
