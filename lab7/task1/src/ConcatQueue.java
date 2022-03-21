import java.util.Scanner;

public class ConcatQueue {



    public Queue ConcatQ(Queue<Character>[]allWords){
        Queue<Character>singleSen=new Queue<Character>();
        for(int i=0; i<allWords.length;i++){

            if(i==0){
                singleSen=allWords[0];
            }else
                {
                    singleSen.rear.next=allWords[i].front;
                    singleSen.rear=allWords[i].rear;
                }
        }
       return singleSen;
    }


    public void Concat(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter String");
        String s=sc.nextLine();

        String [] words=s.split(" ");
        Queue[]allWords=new Queue[words.length];
        for(int i=0; i< words.length;i++){

            char[]temp=words[i].toCharArray();
            allWords[i]=new Queue<Character>();
            System.out.println("");
            for(char j:temp){
                allWords[i].enqueue(j);
            }
        }
        for(int i=0; i<allWords.length;i++){
            allWords[i].print();
            System.out.println("");
        }
        Queue t=ConcatQ(allWords);


        System.out.println("After of QUEUES Concetation\n");
        t.print();

        System.out.println("");









    }





}
