
public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book(String title, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getPages(){
        return pages;
    }
    
    public int getYear(){
        return year;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
____________________________________________________________________________


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Title:");
            String title = scanner.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        
        System.out.println("What information will be printed? ");
        String response = scanner.nextLine();
        for(Book book: books){
            if(response.equals("everything")){
                System.out.println(book);
            }
            if(response.equals("name")){
                System.out.println(book.getTitle());
            }
        }
        
    }        
}
