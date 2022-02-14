/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week6lab3;

/**
 *
 * @author ASUS
 */
public class Week6Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Queue queue = new Queue();
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i + 1);
        }
        System.out.println("Queue is: ");
        int cou = 0;
        while (!queue.empty()) {
            System.out.print("\t" + queue.dequeue());
            cou++;
            if (cou == 5) {
                System.out.println("");
                cou = 0;
            }
        }
    }
    
}
