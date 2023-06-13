public class Cat extends Animal {
   
    private int hairballs;

    public Cat(String n, int h) {
        super(n);
        hairballs = h;
    } 
    
    public int getHairballs() { return hairballs;}
    
    public void speak() {
        System.out.println("Meow");
    }
}