package lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public  void eat (Plate plate) {
        if (plate.getFood() < appetite) {
            satiety= false;
            plate.decreaseFood(plate.getFood());
        } else {
            satiety = true;
            plate.decreaseFood(appetite);
        }
    }
}
