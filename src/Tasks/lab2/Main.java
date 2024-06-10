package Tasks.lab2;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Иван", 30);
        Person person2 = new Person("Мария", 25);

        System.out.println("Человек 1: " + person1.getName() + ", Возраст: " + person1.getAge());
        System.out.println("Человек 2: " + person2.getName() + ", Возраст: " + person2.getAge());
    }
}

