public class Dog extends Animal{

    private int fleas;

    public Dog(String n, int f) {
        super(n);
        fleas = f;
    }
    
    public int getFleas() {return fleas;}

    public void speak() {
        System.out.println("Woof");
    }
}