package ss10_DSA.thuc_hanh;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(10);

        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);

        linkedList.addFirst(0);

        linkedList.addLast(50);

        linkedList.printList();
    }

}
