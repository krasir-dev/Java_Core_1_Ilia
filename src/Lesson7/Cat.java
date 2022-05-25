package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public boolean isFullness() {
        return fullness;
    }

    public String getName() {
        return name;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate plate) {
        ;
        if (plate.decreaseFood(appetite)) {
            fullness = true;
        }
    }
}
