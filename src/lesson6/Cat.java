package lesson6;

public class Cat extends Animal {

    public Cat(String name, int runBound, int swimBound) {
        super(name, runBound, swimBound);
        count++;
    }

    @Override
    public void printInfo() {
        System.out.printf("Кот = %s, пробежал = %s, проплыл = %s%n",
                getName(),
                getRunBound(),
                getSwimBound());
    }

    public static int getCount() {
        return count;
    }
}
