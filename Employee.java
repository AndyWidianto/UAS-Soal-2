/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author HP
 */
public class Employee {
    private String name;
    private String role; // tambahan atribut role

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void work() {
        System.out.println(getRole() + " bernama " + getName() + " sedang bekerja.");
    }
}

class Manager extends Employee {
    private String department; // tambahan atribut department

    public Manager(String name, String department) {
        super(name, "Manager");
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void work() {
        System.out.println(getRole() + " bernama " + getName() + " sedang mengelola tim di departemen "
                + getDepartment() + ".");
    }
}

class Developer extends Employee {
    private String programmingLanguage; // tambahan atribut programmingLanguage

    public Developer(String name, String programmingLanguage) {
        super(name, "Developer");
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getRole() + " bernama " + getName() + " sedang memprogram dalam bahasa "
                + getProgrammingLanguage() + ".");
    }
}

class Designer extends Employee {
    private String designTool; // tambahan atribut designTool

    public Designer(String name, String designTool) {
        super(name, "Designer");
        this.designTool = designTool;
    }

    public String getDesignTool() {
        return designTool;
    }

    @Override
    public void work() {
        System.out.println(getRole() + " bernama " + getName() + " sedang mendesain menggunakan alat "
                + getDesignTool() + ".");
    }
}

class Main {
    public static void main(String[] args) {

    	 Employee[] employees = new Employee[4];

         employees[0] = new Employee("John Doe", "General Employee");
         employees[1] = new Manager("Vera", "Human Resources");
         employees[2] = new Developer("Lara", "Java");
         employees[3] = new Designer("Jason", "Adobe XD");

         for (Employee employee : employees) {
             System.out.println("Role : " + employee.getRole());
             employee.work();
             System.out.println();
         }
    }
}
