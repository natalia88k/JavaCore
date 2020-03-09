package lesson5;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String telephone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Full name: " + fullName + ", position: " + position + ", email: " + email +
                ", telephone: " + telephone + ", salary: " + salary + ", age: " + age );
    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Petr Sidorov", "CEO", "petr@list.ru",
                "8925543218", 5000, 35);
        persArray[1] = new Person("Svetlana Sokolova", "HR-maneger", "svetlana@list.ru",
                "89024317496", 3000, 32);
        persArray[2] = new Person("Egor Ivanoov", "Developer", "egor@list.ru",
                "89059623546", 4000, 27);
        persArray[3] = new Person("Nikita Lesov", "Economist", "nikita@list.ru",
                "89258634556", 2500, 45);
        persArray[4] = new Person("Alex Petuhov", "Sales manager", "alex@list.ru",
                "89053224821", 3000, 58);

        persArray[0].printInfo();
        persArray[1].printInfo();
        persArray[2].printInfo();
        persArray[3].printInfo();
        persArray[4].printInfo();

    }
}

