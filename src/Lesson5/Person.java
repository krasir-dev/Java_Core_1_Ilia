package Lesson5;

public class Person {

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Person(String name, String position, String email, String phoneNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 || age > 120) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }

    }

    public void print() {
        System.out.println("ФИО: " + name + "; должность: " + position + "; email: " + email + "; телефон: " + phoneNumber + "; заоплата: " + salary + "; возраст: " + age);
    }
}
