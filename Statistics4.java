
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics(){
        this.count = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number){
        this.count = this.count + 1;
        this.sum = this.sum + number;
    }
    
    public int getCount(){
        return count;
    }
    
    public int sum(){
        return sum;
    }
    
    public double average(){
        if(count == 0){
            return 0.0;
        }
        return sum * 1.0 / count;
    }
}
______________________________________________


import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        System.out.println("Enter numbers:");
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            }
            statistics.addNumber(number);
            
            if(number % 2 == 0){
                even.addNumber(number);
            }
            
            if(number % 2 != 0){
                odd.addNumber(number);
            }
        }

//        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }
}
