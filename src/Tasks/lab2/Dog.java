package Tasks.lab2;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик", "Дворняга");
        Dog dog2 = new Dog("Бобик", "Овчарка");

        System.out.println("Собака 1: Имя: " + dog1.getName() + ", Порода: " + dog1.getBreed());
        System.out.println("Собака 2: Имя: " + dog2.getName() + ", Порода: " + dog2.getBreed());

        dog1.setName("Джек");
        dog1.setBreed("Лабрадор");
        dog2.setName("Мухтар");
        dog2.setBreed("Доберман");

        System.out.println("Обновленная Собака 1: Имя: " + dog1.getName() + ", Порода: " + dog1.getBreed());
        System.out.println("Обновленная Собака 2: Имя: " + dog2.getName() + ", Порода: " + dog2.getBreed());
    }
}
