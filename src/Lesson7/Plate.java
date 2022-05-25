package Lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public boolean decreaseFood(int amount) {
        boolean result = false;
        if (food >= amount) {
            food -= amount;

            System.out.println("Food amount " + food);
            result = true;
        } else {
            System.out.println("В тарелке недостаточно еды");

        }
        return result;
    }

    public void increaseFood(int amount) {
        food += amount;
        System.out.println("Food amount " + food);
    }
}
