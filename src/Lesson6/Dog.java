package Lesson6;

public class Dog extends Animals {

    static int count;

    public Dog(String name) {
        super(name);
        count++;
        System.out.println("Создана " + count + " собака");
    }

    @Override
    public void run(int length) {
        if (length <= 500) {
            System.out.println("Собака " + name + " пробежал/а " + length + " метров");
        } else {
            System.out.println("Собака не может пробегать больше 500 метров");
        }

    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            System.out.println("Собака " + name + " проплыл/а " + length + " метров");
        } else {
            System.out.println("Собака не может проплыть больше 10 метров");
        }
    }
}
