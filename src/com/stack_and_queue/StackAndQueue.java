package com.stack_and_queue;

public class StackAndQueue {
    Node head;
    static int size = 0;
    class Node {
        Object data;
        Node next;
        Node(Object data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // Uc3 = enque elements in Queue.
    public void enqueElementsInQueue(Object data){   // creating enque method in queue
        Node newNode = new Node(data);
        if(head == null){                          // check queue is empty or not
            head = newNode;
            return;
        }
        Node temp = head;                         // taking temporary variable temp
        while (temp.next != null){
            temp = temp.next;                     // traverse till end of queue
        }
        temp.next = newNode;
    }
    // display the Queue elements.
    public void displayElements(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data +" => ");  //display all elements in stack
            temp = temp.next;

        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        StackAndQueue runner = new StackAndQueue();
        runner.enqueElementsInQueue(56);
        runner.enqueElementsInQueue(30);
        runner.enqueElementsInQueue(70);
        runner.displayElements();
    }
}
