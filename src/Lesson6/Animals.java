package Lesson6;

abstract class Animals {
    String name;
    static int count;

    public Animals(String name) {
        this.name = name;
        count++;
        System.out.println("Создано " + count + " животное");
    }


    public abstract void run(int length);

    public abstract void swim(int length);

}
