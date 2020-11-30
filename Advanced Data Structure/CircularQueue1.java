package DSArraypack;

public class CircularQueue1 {
    int front,rear;
    int capacity;
    int cirQueue[];

    CircularQueue1(int capacity)
    {

        this.capacity=capacity;
        this.rear=-1;
        this.front=-1;
        this.cirQueue=new int [capacity];
    }
    public  void enqueueQueuq(int ele)
    {
        if (((rear + 1) % capacity) == front)
        {
            System.out.println("Queue is full");
        }
        else {
            if (rear == front && front == -1)
            {
                front = 0;
        }
        rear = (rear + 1) % capacity;
        cirQueue[rear] = ele;
    }
    }

void dequeue() {
    if (rear == front && rear == -1) {
        System.out.println("Queue is empty");
    } else {
        int ele = cirQueue[front];
        cirQueue[front] = 0;
        if (rear == front) {
            rear = -1;
            front = -1;

        } else {
            front = (front + 1) % capacity;
        }
        System.out.println(ele + "dequeue from  the queue");


    }
}
    public void Display()
    {
        if (front == rear)
        {
            System.out.println("Queue is empty");


        }
        for(int i=front;i<rear;i++)
        {
            System.out.println(cirQueue[i]);
        }


    }

  public static void main(String []args)
  {

      int capacity=5;
       CircularQueue1 q=new CircularQueue1(capacity);
       q.enqueueQueuq(10);
       q.enqueueQueuq(20);
       q.enqueueQueuq(30);
       q.enqueueQueuq(40);
       q.enqueueQueuq(50);




  }

}

