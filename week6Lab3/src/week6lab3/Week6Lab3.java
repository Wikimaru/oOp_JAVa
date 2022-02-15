package week6lab3;

public class Week6Lab3 {

    public static void main(String[] args) {
         Queue queue = new Queue();
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i+1);
        }
        System.out.println("\tQueue : "+ queue.dequeue()+" Pass");
        System.out.println("\tQueue : "+ queue.dequeue()+" Pass");
        System.out.println("Queue is: ");
        queue.enqueue(2077);
        int cou = 0;
        while (!queue.empty()) {
            System.out.print("\t" + queue.dequeue());
            cou++;
            if (cou == 5) {
                System.out.println("");
                cou = 0;
            }
        }
        System.out.println("");
        System.out.println("\t==================================");
        cou = 0;
    }
    
}
