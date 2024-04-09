
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account myAccount = new Account("My account", 100.00);
        
        System.out.println("Initial state");
        System.out.println(myAccount);
        System.out.println("");
        
        myAccount.deposit(20.00);
        
        System.out.println("End state");
        System.out.println(myAccount);
    }
}
