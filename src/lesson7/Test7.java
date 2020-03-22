package lesson7;

public class Test7 {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(10);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
        plate.info();
        plate.addFood(10);
        plate.info();

        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Murzik",  11);
        cats[1] = new Cat("Bublik", 5);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].isSatiety());
        }

    }
}
