package lesson6;

public class Dog extends Animal {

    public Dog(String name, int runBound, int swimBound) {
        super(name, runBound, swimBound);
        count++;
    }

    @Override
    public void printInfo() {
            System.out.printf("Собака = %s, пробежала = %s, проплыла = %s%n",
                    getName(),
                    getRunBound(),
                    getSwimBound());
    }

    public static int getCount() {
        return count;
    }
}
