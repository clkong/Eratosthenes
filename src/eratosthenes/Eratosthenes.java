/*
 * Sean Luo 24/09/2018
 * Eratosthenes.java
 * This progrem calculates the Eratosthenes
 */
package eratosthenes;

/**
 *
 * @author clkon
 */
//    public static boolean isPrime(int num) {
public class Eratosthenes {
    public static boolean isPrime(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public  static void main(String[] args) {      
        System.out.println("The prime numbers from 1 -"
                        + "1000 are:");
        for(int j = 2; j <= 1000; j++) {
            if(Eratosthenes.isPrime(j)) {
                System.out.println(j);
            }
        }
    }
}
    

