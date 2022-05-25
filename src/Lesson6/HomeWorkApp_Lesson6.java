package Lesson6;

public class HomeWorkApp_Lesson6 {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Барсик");
        catBarsik.run(150);
        catBarsik.swim(500);

        Cat catMurzik = new Cat("Мурзик");
        catMurzik.run(10);
        catMurzik.swim(2);

        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(600);
        dogBobik.swim(40);


    }
}
