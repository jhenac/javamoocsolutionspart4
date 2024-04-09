
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        Account matthew = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0.00);
        
        System.out.println("Initial state");
        System.out.println(matthew);
        System.out.println(myAccount);
        System.out.println("");
        
        matthew.withdrawal(100.00);
        myAccount.deposit(100.00);
        
        System.out.println("End state");
        System.out.println(matthew);
        System.out.println(myAccount);
        
    }
}
