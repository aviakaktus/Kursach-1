package skypro;
//Курсовая работа №1
public class Main
{
    public static void main(String[] args) {
        int sumSalary=0;
        Employee [] employees = new Employee [10];
        employees[0] = new Employee ("Иванов Иван Иванович", 1, 50_000, Employee.countId);
        employees[1] = new Employee ("Петров Петр Петрович", 1, 60_000, Employee.countId);
        employees[2] = new Employee ("Семенов Семен Семенович", 2, 70_000, Employee.countId);
        employees[3] = new Employee ("Борисов Борис Борисович", 2, 30_000, Employee.countId);
        employees[4] = new Employee ("Сидоров Сидор Сидорович", 3, 20_000, Employee.countId);
        employees[5] = new Employee ("Александров Александр Александрович", 3, 80_000, Employee.countId);
        employees[6] = new Employee ("Михайлов Михаил Михайлович", 4, 60_000, Employee.countId);
        employees[7] = new Employee ("Степанов Степан Степанович", 4, 100_000, Employee.countId);
        employees[8] = new Employee ("Андреев Андрей Андреевич", 5, 25_000, Employee.countId);
        employees[9] = new Employee ("Владимиров Владимир Владимирович", 5, 120_000, Employee.countId);

        // 1.Получить список всех сотрудников со всеми имеющимися по ним данными
        for (int i=0; i<employees.length; i++){
            System.out.println(employees[i] );}
        System.out.println();

        //2.Посчитать сумму затрат на зарплаты в месяц.
        for (int i=0; i<employees.length; i++){
            sumSalary = sumSalary + employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплату в месяц " + sumSalary + " рублей.");

        //3. Подсчитать среднее значение зарплат.
        System.out.println("Средняя зарплата составляет " + sumSalary/employees.length + " рублей.");
        System.out.println();

        //4. Получить Ф. И. О. всех сотрудников (вывести в консоль).
        System.out.println("Ф.И.О. всех сотрудников компании: ");
        for (int i=0; i<employees.length; i++){
            System.out.print(employees[i].getName() +", ");}
        System.out.println();
        System.out.println();

        //5. Найти сотрудника с минимальной зарплатой.
        int i1 = 0;
        int i2 = 1;
        for (int a=1; a< employees.length; a++){
            if (employees[i1].getSalary() < employees[i2].getSalary()) {
                i2++;}
            else {
                i1=i2;
                i2++;}
        }
        System.out.println("Минимальная зарплата у сотрудника: " + employees[i1].getName() + " :" + employees[i1].getSalary() + " рублей." );

        //6. Найти сотрудника с максимальной зарплатой.
        int y1 = 0;
        int y2 = 1;
        for (int b=1; b < employees.length; b++){
            if (employees[y1].getSalary() > employees[y2].getSalary()) {
                y2++;}
            else {
                y1=y2;
                y2++;}
        }
        System.out.println("Максимальная зарплата у сотрудника: " + employees[y1].getName() + " :" + employees[y1].getSalary() + " рублей." );
    }
}
