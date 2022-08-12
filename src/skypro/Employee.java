package skypro;
//Курсовая работа №1
public class Employee{
    public static int countId = 1;
    private String name;
    private int department;
    private int salary;
    public final int id;

    public Employee (String name, int department, int salary, int id){

        this.id = countId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        countId++;

    }

    public String getName(){ //геттер для name
        return this.name;
    }
    public int getDepartment(){ //геттер для department
        return this.department;
    }
    public int getSalary(){ //геттер для salary
        return this.salary;
    }
    public int getId(){ //геттер для id
        return this.id;
    }

    public void setSalary (int salary){ //сеттер для salary
        this.salary = salary;}
    public void setDepartment (int department){ //сеттер для department
        this.department = department;}

    @Override
    public String toString(){

        return name + " - Отдел: " + department+  ". Зарплата " + salary + " рублей. ID: " + this.id;
    }
}

