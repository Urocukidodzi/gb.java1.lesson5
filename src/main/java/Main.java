


public class Main {

    public static class Employee {
        private String fullName;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;


        public Employee(String fullName, String position, String email, String phone, int salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public void employeePrint() {
            System.out.println("ФИО: " + (this.fullName).toUpperCase() + "\n" +
                    "должность: " + this.position + "\n" +
                    "e-mail: "+ this.email + "\n" +
                    "телефон: " + this.phone + "\n" +
                    "заработная плата: " + this.salary + "\n" +
                    "возраст: " + age + "\n");
        }
    }

    public static void main(String[] args) {

        Employee[] employeeArray =  create5Employees();
        printAll(employeeArray);

    }

    private static void printAll(Employee[] employeeArray) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].age >= 40){
                employeeArray[i].employeePrint();
            }
        }
    }

    private static Employee[] create5Employees() {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeeArray[1] = new Employee("Artemov Ivan", "Director", "arivan@mailbox.com", "892312312", 300000, 42);
        employeeArray[2] = new Employee("Maslod Dima", "Cleaner", "mad@mailbox.com", "892312312", 21000, 54);
        employeeArray[3] = new Employee("Panamarenko Sveta", "Secretary", "ivivan@mailbox.com", "892312312", 30000, 28);
        employeeArray[4] = new Employee("Khaziev Egor", "Programmer", "egor5.87@mail.ru", "892312312", 110000, 36);
        return employeeArray;
    }
}
