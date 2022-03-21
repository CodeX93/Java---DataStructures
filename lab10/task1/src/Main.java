import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Recursion r=new Recursion();
        int choice=0;
	// write your code here
        do {
            System.out.println("1.\tRecursion GCD\n" +
                    "2.\tReverse String\n" +
                    "3.\tELFISH\n" +
                    "0.\tExit Program\n" +
                    "Press Any Option:\t");
            choice = sc.nextInt();
            sc.nextLine();


            if(choice==1){
                System.out.print("\nEnter Number 1: ");
                int num1=sc.nextInt();
                sc.nextLine();
                System.out.print("\nSystem Number 2: ");
                int num2= sc.nextInt();
                sc.nextLine();
                System.out.println("The GCD for the two Numbers is: "+r.GCDFind(num1,num2)+"\n");
            }

            if(choice==2){
                System.out.print("\nEnter String: ");
                String str=sc.nextLine();
                r.reverseString(str,0);
                System.out.println("\n");
            }
            if(choice==3){
                System.out.print("\nEnter String: ");
                String str=sc.nextLine();
               r.elfish(false,false,false,str,0);

            }
            if(choice==0){System.exit(0);}





        }while (choice>=0 || choice<=3);
    }
}
