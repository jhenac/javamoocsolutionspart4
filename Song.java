public class Song {
    private String name;
    private int length;
    
    public Song(String name, int length){
        this.name = name;
        this.length = length;
    }
    
    public String name(){
        return name;
    }
    
    public int length(){
        return length;
    }
}
____________________________________________________________________________________

public class Main {

  public static void main(String[] args) {
    // This is just an empty main method, where you can test your
    // Song class. You can for instance try this:

     Song garden = new Song("In The Garden", 10910);
     System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");

  }
}
