package Questao03;

/**
 * 17/03/2020
 * @author thais
 */
public class Main {
    
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        Q2 q2 = new Q2();
        
        q1.start();
        q2.start();
        
        q1.interrupt();
        System.out.println("Thread q1: " + q1.isInterrupted());
        
        q2.interrupt();
        System.out.println("Thread q2: " + q2.isInterrupted());
    }
}
