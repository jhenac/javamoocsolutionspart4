
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }
    
    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably(){
        this.balance = this.balance - 2.60;
    }
    
    public void eatHeartily(){
        this.balance = this.balance - 4.60;
    }
}
___________________________________________________________________________

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
         PaymentCard card = new PaymentCard(50);
         System.out.println(card);
         
         card.eatAffordably();
         System.out.println(card);
         
         card.eatHeartily();
         card.eatAffordably();
         System.out.println(card);
    }
}
