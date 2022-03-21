import java.awt.*;
import java.util.Scanner;

public class Main {



    public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int choice2;
       do {
           System.out.println("1.\tTask 1\n" +
                   "2.\tTask 2\n" +
                   "3.\tTask 3\n" +
                   "Select Any");
            choice2 = sc.nextInt();

           if (choice2 == 1) {
               Main.Menu();
           }
           if (choice2 == 2) {
               Robin r = new Robin();
               r.insertTask();
           }
           if(choice2==3){ConcatQueue cq=new ConcatQueue();
           cq.Concat();}
           if(choice2==0){System.exit(0);}
       }while (choice2>=0 || choice2<=2);
    }






    public  static void Menu() {
        // write your code here
        Queue q = new Queue();

        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n\n");
            System.out.println("1.\tInsert Node");
            System.out.println("2.\tDelete Front of QueueList");
            System.out.println("3.\tPrint Queue List");
            System.out.println("4.\tCheck if Queue is Empty");
            System.out.println("5.\tRobinModule");
            System.out.println("0.\tBack TO Main Menu");
            System.out.print("Select Any One:\t");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter Node");
                int key = sc.nextInt();
                q.enqueue(key);
            }
            if (choice == 2) {
                q.dequeue();
            }
            if(choice==3){q.print();
                System.out.println("");}
            if (choice == 4) {
                if (q.isEmpty()) {
                    System.out.println("Queue is Empty");}
                    else System.out.println("Queue is Not Empty");
                }





            if(choice==0){break;}

                if (choice < 0 || choice > 5) {
                    System.out.println("Invalid Input");
                }
            } while (choice >= 0 || choice <= 3) ;

    }

}

