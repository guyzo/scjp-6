package scjp.chapter2.slorber;

public class Sheep {
    private static char defaultCategory = 'C'; // 1
    
    private int category;
    public Sheep(short category) { // 2
        this.category = category; // 3
    }
    public Sheep() {
        this(
                (short)defaultCategory // 4
        ); // 5
    }
}
class Test2 {
    public static void main(String[] args) {
        short sheepCategory = 3;
        Sheep s = new Sheep(15); // 6
        s = new Sheep(); // 7
        s = new Sheep(sheepCategory); // 8
    }
}

// Does compilation fail? 
// a) YES: Give number(s) where it fails?
// b) NO: exception raised at runtime?

