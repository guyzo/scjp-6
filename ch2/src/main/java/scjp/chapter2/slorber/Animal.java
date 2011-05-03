package scjp.chapter2.slorber;

public class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public Animal() {
        this("randomName"); // 1
        this.name = "randomName"; // 2
    }
}
class Dog extends Animal {
    private String tail;
    public Dog(String name) {
        super(name); // 3
    }
    public Dog(String name,String tail) {
        this.name = name; // 4
        this.tail = tail; // 5
    }
}
class Test {
    public static void main(String[] args) {
        new Animal(); // 6
        new Animal("Titi"); // 7
        new Dog(); // 8
        new Dog("Titi"); // 9
        new Dog("Titi","SmallTail"); // 10
    }
}
// Give number(s) where compilation fails?