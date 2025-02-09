public class Main {
    private static Employee[] employees = new Employee[10]; // Хранилище для сотрудников

    public static void main(String[] args) {
        // Создание сотрудников
        employees[0] = new Employee("Иванов Иван Иванович", 1, 50000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 60000);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 3, 40000);
        employees[3] = new Employee("Алексеев Алексей Алексеевич", 4, 70000);
        employees[4] = new Employee("Марков Марк Маркович", 5, 30000);

        printAllEmployees();
        System.out.println("Сумма затрат на З/П: " + calculateTotalSalary());
        System.out.println("Сотрудник с минимальной З/П: " + findMinSalaryEmployee());
        System.out.println("Сотрудник с максимальной З/П: " + findMaxSalaryEmployee());
        System.out.println("Среднее значение зарплат: " + calculateAverageSalary());
        printEmployeeFullNames();
    }

    private static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static double calculateTotalSalary() {
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    private static Employee findMinSalaryEmployee() {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    private static Employee findMaxSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    private static double calculateAverageSalary() {
        double totalSalary = calculateTotalSalary();
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return count > 0 ? totalSalary / count : 0;
    }

    private static void printEmployeeFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
