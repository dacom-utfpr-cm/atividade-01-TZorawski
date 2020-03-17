package Questao05;

/**
 * 17/03/2020
 * @author thais
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadQ5 tq5 = new ThreadQ5();
        
        tq5.start();
        
        tq5.join();
        
        System.out.println("Soma finalizada.");
    }
}
