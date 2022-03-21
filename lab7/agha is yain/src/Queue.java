
public class Queue {
    private int [] queue;
    private int front = 0,rear = 0,capacity;

    Queue(int size)
    {
        capacity = size;
        queue = new int[size];
    }


    void enqueue(int x) {
        if (capacity == rear) {
            System.out.println("Queue is full");
        }
        else
        {
            queue[rear] = x;
            rear++;
        }
    }

    void dequeue()
    {
        if(front == rear)
        {
            System.out.println("Queue is empty");
        }
        else {
            for(int i = 0 ; i < rear-1 ;i++)
            {
                queue[i] = queue[i+1];
            }
            rear--;
        }
    }

    void display()
    {
        for(int i = 0; i < rear ;i++)
        {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    void sort()
    {
        int n = rear;
        int x = 0;
        boolean b = false;
        for(int i = 0 ; i < n ; i++)
        {
            x = 0;
            for(int j= 0 ; j < n ; j++)
            {
                if (x < queue[j])
                {
                    b = false;
                    for(int k = n ; k < capacity; k++)
                    {
                        if(queue[k] == queue[j])
                        {
                            b = true;
                            break;
                        }
                    }
                    if(!b)
                    {
                        x = queue[j];
                    }
                }
            }

            enqueue(x);

        }
        for(int i = 0 ; i < n ; i++)
        {
            dequeue();
        }
    }



}
