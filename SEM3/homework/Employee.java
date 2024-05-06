// Создать класс ”Сотрудник” с полями: ФИО, должность, телефон,
// зарплата, возраст; 

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    private static final int YEAR = 2024;
    private String name;
    private String secondName;
    private String surName;
    private String post;
    private String numberPhone;
    private int salary;
    String bithday;

    public Employee(String name, String secondName, String surName, String post, String numberPhone, int salary,
            String bithday) {
        this.name = name;
        this.secondName = secondName;
        this.surName = surName;
        this.post = post;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.bithday = bithday;
    }

    public String getFullName() {
        return this.name + " " + this.surName + " " + this.secondName;
    }

    public String getPost() {
        return this.post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getNumberPhone() {
        return this.numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        String[] date = this.bithday.split("-");
        int year = Integer.parseInt(date[0]);
        return YEAR - year;
    }

    public String getBithday() {
        return this.bithday;
    }

    // Написать функцию выводящую всю доступную информацию об
    // объекте

    public void getInfo() {
        System.out.println("Employee{" +
                "name'" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", sureName='" + surName + '\'' +
                ", salary='" + salary + '\'' +
                ", post='" + post + '\'' +
                ",phone='" + numberPhone + '\'' +
                "age='" + getAge() +
                '}');
    }

    // Создать метод, повышающий зарплату всем сотрудникам старше
    // 45 лет на 5000. Метод должен принимать в качестве параметра массив
    // сотрудников.

    // Написать тот же метод, но возраст и размер повышения должны быть параметрами
    // метода

    public void addSalary(int amount) {
        this.salary += amount;
    }

    public void changeSalary(Employee[] employees, int amount, int age) {
        for (Employee employee : employees) {
            if (employee.getAge() > age) {
                employee.addSalary(amount);
            }
        }
    }

    // Написать методы (принимающие на вход массив сотрудников),
    // вычисляющие средний возраст и среднюю зарплату сотрудников, вывести
    // результаты работы в консоль.

    public void AvarrageAge(Employee[] employees) {
        int sumAge = 0;
        for (Employee employee : employees) {
            sumAge += employee.getAge();
        }
        System.out.println("Средний возраст: " + sumAge / employees.length);
    }

    public void AvarrageSalary(Employee[] employees) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        System.out.println("Средняя зарплата: " + sumSalary / employees.length);
    }

    // Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий
    // две даты, представленные в виде трёх чисел гггг-мм-дд, без использования
    // условного оператора.

    @Override
    public int compare(Employee employee1, Employee employee2) {
        String[] date1 = employee1.getBithday().split("-");
        String[] date2 = employee2.getBithday().split("-");

        int year1 = Integer.parseInt(date1[0]);
        int month1 = Integer.parseInt(date1[1]);
        int day1 = Integer.parseInt(date1[2]);

        int year2 = Integer.parseInt(date2[0]);
        int month2 = Integer.parseInt(date2[1]);
        int day2 = Integer.parseInt(date2[2]);

        int res = (year1 - year2) + (month1 - month2) + (day1 - day2);
        return res;
    }
}
