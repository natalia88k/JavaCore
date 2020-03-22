package lesson6;

public class Test6 {

    public static void main(String[] args) {
        Cat cat = new Cat("Кузя", 700, 100);
        Dog dog = new Dog("Бублик", 1000, 90);

        cat.printInfo();
        dog.printInfo();
    }
}
