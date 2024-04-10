
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {

    private String name;
    private LocalDateTime createdAt;

    public Item(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        return this.name + " (created at: " + formatter.format(this.createdAt) + ")";
    }
}
______________________________________________________________________________________________


import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){ 
            System.out.println("Name:");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            items.add(new Item(name));            
        }
        for(Item item: items){
            System.out.println(item);
        }
    }
}
