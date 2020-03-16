package lesson6;

public class Animal {

    private String name;
    private int runBound;
    private int swimBound;
    protected static int count;

    public Animal(String name, int runBound, int swimBound) {
        this.name = name;
        this.runBound = runBound;
        this.swimBound = swimBound;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunBound() {
        return runBound;
    }

    public void setRunBound(int runBound) {
        this.runBound = runBound;
    }

    public int getSwimBound() {
        return swimBound;
    }

    public void setSwimBound(int swimBound) {
        this.swimBound = swimBound;
    }

    public  void run(int length) {
        if (0 <= length && length < runBound) {
            System.out.println(name + " пробежал " + length);
        } else {
            System.out.println(name + " не бежит");
        }
    }

    public void swim(int lenght) {
        if (0 <= lenght && lenght < swimBound) {
            System.out.println(name + " проплыл " + lenght);
        } else {
            System.out.println(name + " не плывет");
        }
    }

    public void printInfo() {
        System.out.printf("Животное = %s, пробежало = %s, проплыло = %s%n",
                getName(),
                getRunBound(),
                getSwimBound());
    }

    public static int getCount() {
        return  count;
    }
}
