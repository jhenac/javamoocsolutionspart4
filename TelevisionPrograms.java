
public class TelevisionProgram {

    private String name;
    private int duration;

    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public boolean isAwesome() {
        return this.name.contains("MasterChef");
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }
}
_____________________________________________________________

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name:");
            String name = scanner.nextLine();
            
            if(name.isEmpty()){
                break;
            }
            
            System.out.println("Duration:");
            int duration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name, duration));
        }
        
        System.out.println("Program's maximum duration?");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram program: programs){
            if(program.getDuration() <= maxDuration){
                System.out.println(program);
            }
        }
    }
}
