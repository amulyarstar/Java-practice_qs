class Bank {
 int balance = 0;
synchronized void deposit(int amount) {
balance = balance + amount;
System.out.println("Deposited: " + amount);
 notify();
}
synchronized void withdraw(int amount) {
 System.out.println("Trying to Withdraw");
 while(balance < amount) {
 System.out.println("Insufficient Balance");
try {wait();
} catch(Exception e) {
  }
 }
 balance = balance - amount;
  System.out.println( "Withdrawn: " + amount);
    }
}
class DepositThread extends Thread {
 Bank b;
DepositThread(Bank b) {
 this.b = b;
    }
 public void run() {
   b.deposit(5000);
    }
}
class WithdrawThread extends Thread {
 Bank b;
 WithdrawThread(Bank b) {
 } this.b = b;
public void run() {
 b.withdraw(3000);
    }
}
public class Main {
public static void main(String[] args) {
Bank b = new Bank();
DepositThread d =new DepositThread(b);
WithdrawThread w =new WithdrawThread(b);
w.start();
d.start();
}
}
