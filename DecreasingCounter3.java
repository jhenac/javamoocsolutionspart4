
public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        if(this.value > 0) {
            this.value = this.value - 1;
        }
    }

    // the other methods go here
    public void reset(){
        // resets value to 0
        this.value = 0;
    }
}
____________________________________________________________________________


public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();
        
        counter.reset();
        counter.printValue();
        
        counter.decrement();
        counter.printValue();
    }
}
