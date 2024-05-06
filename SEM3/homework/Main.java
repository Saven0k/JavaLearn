public class Main {

    public static void main(String[] args) {
        // Создать массив из 5 сотрудников

        Employee employee1 = new Employee("Vova", "Ivanov", "John", "Master", "89813912", 500, "1945-12-31");
        Employee employee2 = new Employee("Ivanov", "Ivanov", "John", "Master", "8123912", 530, "1955-11-01");
        Employee employee3 = new Employee("John", "Ivanov", "Vova", "Master", "895123912", 50, "1965-05-03");
        Employee employee4 = new Employee("Vova", "Vova", "John", "Master", "8964563912", 500, "1975-05-30");
        Employee employee5 = new Employee("Lox", "Goga", "John", "Master", "89435654673912", 51, "1985-01-01");

        Supervisor supervisor = new Supervisor("Geqw", "Gaga", "John", "Genos", "123123", 31, "2005-01-01");

        Employee[] employees = new Employee[] {employee1, employee2, employee3, employee4, employee5, supervisor};



        // Проверка метода, который повышает зарплату всем сотрудникам старше 45 лет на 5000. Написать тот же метод, но возраст и размер повышения должны быть параметрами метода


        // for (Employee employee : employees) {
        //     employee.changeSalary(employees, 100000, 50);
        // }

        // for (Employee employee : employees) {
        //     employee.getInfo();
        // }



        // Написать методы (принимающие на вход массив сотрудников), вычисляющиесредний возраст и среднюю зарплатусотрудников, вывести результаты работы в консоль. 

        // employee1.AvarrageAge(employees);
        // employee1.AvarrageSalary(employees);



        //Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий
        // две даты, представленные в виде трёх чисел гггг-мм-дд, без использования
        // условного оператора

        // int result = employee1.compare(employee1, employee2);

        // if  (result == 0) {
        //     System.out.println("Даты рождения совпадают");
        // } else if (result > 0) {
        //     System.out.println("Дата рождения " + employee1.getFullName() +  " раньше, чем у " + employee2.getFullName());
        // } else if (result < 0) {
        //     System.out.println("Дата рождения" + employee1.getFullName() + "раньше, чем у" + employee2.getFullName());
        // }


        Supervisor.UpperSalary(employees, 5000);

        for (Employee employee : employees) {
            System.out.println(employee.getSalary());
        }
    }
    
}
