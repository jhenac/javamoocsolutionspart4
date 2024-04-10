
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }
    
    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably(){
        if(this.balance - 2.6 < 0){
            this.balance = this.balance;            
        }else{
            this.balance = this.balance - 2.60;
        }
    }
    
    public void eatHeartily(){
        if(this.balance - 4.6 < 0){
            this.balance = this.balance;
        }else{
            this.balance = this.balance - 4.60;
        }
    }
    
    public void addMoney(double amount){
        if(amount < 0){
            this.balance = this.balance;
        }else if(this.balance + amount > 150){
            this.balance = 150.0;
        }else{
            this.balance = this.balance + amount * 1.0;
        }
    }
}
______________________________________________________________

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        PaymentCard card = new PaymentCard(10);
        System.out.println("Paul: " + card);
        card.addMoney(-15);
        System.out.println("Paul: " + card);
    }
}
