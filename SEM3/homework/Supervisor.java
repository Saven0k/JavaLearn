public class Supervisor extends Employee{
    // Опишите класс руководителя, наследник от сотрудника. Перенесите статический
    // метод повышения зарплаты в класс руководителя, модифицируйте метод таким
    // образом, чтобы он мог поднять заработную плату всем, кроме руководителей. В
    // основной программе создайте руководителя и поместите его в общий массив
    // сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата
    // руководителя не повысилась.

    public Supervisor(String name, String secondName, String surName, String post, String numberPhone, int salary,
    String bithday) {
        super(name, secondName, surName, post, numberPhone, salary, bithday);
    }

    public static void UpperSalary(Employee[] employees, int amount) {
        for (Employee employee : employees) {
            if (!(employee instanceof Supervisor)) {
                employee.addSalary(amount);
            }
        }
    }
}
