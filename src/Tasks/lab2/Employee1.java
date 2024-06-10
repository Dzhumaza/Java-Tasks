package Tasks.lab2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee1 {
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Конструктор
    public Employee1(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Метод для получения имени сотрудника
    public String getName() {
        return name;
    }

    // Метод для установки имени сотрудника
    public void setName(String name) {
        this.name = name;
    }

    // Метод для получения зарплаты сотрудника
    public double getSalary() {
        return salary;
    }

    // Метод для установки зарплаты сотрудника
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Метод для получения даты приема на работу
    public LocalDate getHireDate() {
        return hireDate;
    }

    // Метод для установки даты приема на работу
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    // Метод для расчета стажа работы
    public long calculateYearsOfWork() {
        LocalDate currentDate = LocalDate.now();
        return ChronoUnit.YEARS.between(hireDate, currentDate);
    }

    public static void main(String[] args) {
        // Создание сотрудника
        LocalDate hireDate = LocalDate.of(2010, 5, 15);
        Employee1 employee = new Employee1("Арафат", 50000, hireDate);

        // Вывод информации о сотруднике и его стаже работы
        System.out.println("Имя: " + employee.getName());
        System.out.println("Зарплата: " + employee.getSalary());
        System.out.println("Дата приема на работу: " + employee.getHireDate());
        System.out.println("Стаж работы (лет): " + employee.calculateYearsOfWork());
    }
}
