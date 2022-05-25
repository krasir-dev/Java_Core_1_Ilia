package Lesson6;

public class Cat extends Animals {
    static int count;

    public Cat(String name) {
        super(name);
        count++;
        System.out.println("Создан " + count + " кот");
    }

    @Override
    public void run(int length) {
        if (length <= 200) {
            System.out.println("Кот " + name + " пробежал " + length + " метров");
        } else {
            System.out.println("Кот не может пробегать больше 200 метров");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Кот не умеет плавать");
    }
}
