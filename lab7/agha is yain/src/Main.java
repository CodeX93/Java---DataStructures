

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue(8);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(1);
        q.enqueue(2);
        q.display();
        q.sort();
        q.display();
    }
}
