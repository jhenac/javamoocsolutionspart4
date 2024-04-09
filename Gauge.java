public class Gauge {
    private int value;
    
    public Gauge(){
        this.value = 0;
    }
    
    public void increase(){
        if (this.value < 5){
            this.value = this.value + 1;
        }
    }
    
    public void decrease(){
        if(this.value > 0){
            this.value = this.value -1;
        }
    }
    
    public int value(){
        return value;
    }
    
    public boolean full(){
        return value == 5;
    }
}
____________________________________________________________


public class Main {

    public static void main(String[] args) {
        // Test your Gauge class here

         Gauge g = new Gauge();

         while(!g.full()) {
             System.out.println("Not full! Value: " + g.value());
             g.increase();
         }

         System.out.println("Full! Value: " + g.value());
         g.decrease();
         System.out.println("Not full! Value: " + g.value());
    }
}
