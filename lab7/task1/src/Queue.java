public class Queue<T> {

    QNode front, rear;

    public Queue()
    {
        this.front = this.rear = null;
    }

    // Method to add an key to the queue.
    void enqueue(T key)
    {
        QNode temp = new QNode(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    void dequeue()
    {
        if (this.front == null)
            return;

        QNode temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }
    void print(){
QNode q=front;
        while(q!=null){

            System.out.print(q.key+", ");
            q=q.next;
        }
    }


    boolean isEmpty(){
        boolean flag=false;
        QNode q=front;
        while(q!=null){
            return flag;
        } flag=true;
        return flag;
    }

}
