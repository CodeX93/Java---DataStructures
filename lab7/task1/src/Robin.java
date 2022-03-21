import java.util.Scanner;

public class Robin {
           Scanner sc =new Scanner(System.in);
    void insertTask(){
        Queue<Integer> robin=new Queue<>();

        System.out.println("How Many Task You Like to Enter");
        int taskn=sc.nextInt();
        for (int i=1; i<=taskn; i++) {
            System.out.println("Enter Task: "+i+" Time: ");
            int taskT=sc.nextInt();
            robin.enqueue(taskT);

        }

        System.out.println("Enter the Quantum");
        int quantum=sc.nextInt();
        QNode <Integer> curr= robin.front;
        while(robin.front!=null){

            int temp=curr.key-quantum;
            if(temp<=0){robin.dequeue();}
            else {
                robin.enqueue(temp);
                robin.dequeue();

            }
            System.out.println("\nA Next Cycle is rescheduled for completion of tasks\nRemaining Task Times   ");
            System.out.println("");
            robin.print();
            curr=curr.next;
        }
        System.out.println("All Task Completed");










//        System.out.print("How many ours the task need to complete");
//        int reqtime=sc.nextInt();
//        System.out.print("Set the Quantum");
//        int quantum=sc.nextInt();
//
//        robin.enqueue(reqtime);
//
//        if(reqtime>quantum){
//            while(quantum<=reqtime){
//
//                reqtime=reqtime-quantum;
//                robin.dequeue();
//                robin.enqueue(reqtime);
//
//                System.out.println("Task is Rescheduled for another Cycle");
//            }
//        }
//        System.out.println("Task Completed");



    }

}
