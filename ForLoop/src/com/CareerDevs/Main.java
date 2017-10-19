package com.CareerDevs;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest= "+calculateInterest(10000,2.0));
        //for(init; termination, increment)
        for(double i=8; i>1; i--){
            System.out.println("10,000 at "+i+"% interest= "+String.format("%.2f",calculateInterest(10000,i)));
        }

        //testing and counting the number of prime numbers in chosen range
        int count=0;
        for(int i=10; i<50;i++){
            if(isPrime(i)){
                count++;
                System.out.println("The number "+i+" is prime");
            }
            if(count==10){
                break;
            }
        }
    }
    public static double calculateInterest (double amount, double interestRate){
        return (amount*(interestRate/100));
    }

    //prime numbers method
    public static boolean isPrime(int n){
        for(int i=2;i<=(long) Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }

        return true;

    }
}
