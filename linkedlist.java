public class linkedlist {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
            this.next=null;

        }
    }
    public static node head;
    public static node tail;


    public void addFirst(int data){
        //steps1=create new node
        node newNode = new node(data);
        if(head == null){
            head = tail=newNode;
            return;

        }
        //steps2 - newNode next = head
        newNode.next = head;//link
        //steps3-head =newNode
        head= newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("ll is empty");
        }
        node temp = head;
        while(temp!= null){
            System.out.print(temp.data+" ->");
            temp  =temp.next;
        }
        System.out.println("null");
    }
        public void add(int idx,int data){
            if(idx ==0){
                addFirst(data);
                return;

            }
             node newNode = new  node(data);
             node temp =head;
             int i =0;

             while(i<idx-1){
                temp = temp.next;
                i++;
             }

             //i=idx-1;temp ->prev
             newNode.next = temp.next;
             temp.next = newNode;

        }
    

        public int removeFirst(){
        int size;
if(size == 0){
    System.out.println("ll is empty");
    return Integer.MIN_VALUE;

}else if(size == 1){
    int val = head.data;
    head =tail =null;
    return val;
}
        }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        ll.print();
        ll.addFirst(2);
        ll.print();
         ll.addFirst(1);
         ll.print();
          ll.addFirst(3);
          ll.print();
           ll.addFirst(4);


           ll.print();
    }
}
