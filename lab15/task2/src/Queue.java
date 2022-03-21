public class Queue<T> {

    nodes front, rear;

    public Queue()
    {
        this.front = this.rear = null;
    }

    // Method to add an key to the queue.
    void enqueue(int key)
    {
        nodes temp = new nodes(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    int dequeue()
    {
        if (this.front == null)
            return 0;

        nodes temp = this.front;
        this.front = this.front.next;
        return (int) temp.key;

    }
    void print(){
        nodes q=front;
        while(q!=null){

            System.out.print(q.key+", ");
            q=q.next;
        }
    }


    boolean isEmpty(){
        boolean flag=true;
        nodes q=front;
        while(q!=null){
            flag=false;
            return flag;
        }
    return flag;
    }

}
