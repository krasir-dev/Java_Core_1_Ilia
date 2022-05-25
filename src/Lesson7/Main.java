package Lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] catsArray = new Cat[3];
        catsArray[0] = new Cat("Barsik", 10);
        catsArray[1] = new Cat("Murzik", 5);
        catsArray[2] = new Cat("Pushistik", 40);

        Plate plate = new Plate(50);
        plate.info();

        for (Cat cat : catsArray) {
            cat.eat(plate);
            if (cat.isFullness()) {
                System.out.println("Кот " + cat.getName() + " сыт");
            } else {
                System.out.println("Кот " + cat.getName() + " голоден");
            }
        }


    }
}
