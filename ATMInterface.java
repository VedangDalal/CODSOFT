import java.util.Scanner;

public class ATMInterface {
 private static double balance = 21000; 
 
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 
 while (true) {
 System.out.println("ATM Interface");
 System.out.println("1. Check Balance");
 System.out.println("2. Deposit Money");
 System.out.println("3. Withdraw Money");
 System.out.println("4. Exit");
 System.out.print("Enter your choice: ");
 int choice = sc.nextInt();
  switch (choice) {
 case 1:
 checkBalance();
 break;
 case 2:
     depositMoney();
 break;
 case 3:
 withdrawMoney();
 break;
 case 4:
 System.out.println("Thank you for using the ATM!");
 sc.close();
 System.exit(0);
 default:
 System.out.println("Invalid choice. Please try again.");
 }
 }
 }
 
 public static void checkBalance() {
 System.out.println("Your current balance is: Rs " + balance);
 }
 
 public static void depositMoney() {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the amount to deposit: Rs. ");
 double amount = sc.nextDouble();
 
 if (amount <= 0) {
     System.out.println("Invalid amount. Please enter a positive value.");
 } else {
 balance += amount;
 System.out.println("Rs " + amount + " deposited successfully.");
 }
 }
 
 public static void withdrawMoney() {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the amount to withdraw: Rs ");
 double amount = sc.nextDouble();
 
 if (amount <= 0 || amount > balance) {
 System.out.println("Invalid amount or insufficient funds. Please try again.");
 } else {
 balance -= amount;
 System.out.println("Rs " + amount + " withdrawn successfully.");
 }
 }
}