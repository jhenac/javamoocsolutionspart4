
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }
    
    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }
}
_______________________________________________________________________

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
         PaymentCard card = new PaymentCard(50);
         System.out.println(card);
    }
}
