public class Employee {
    private String name;     
    private double salary;

    // Constructor
    public Employee(String NamaEmployee, double GajiEmployee) {
        this.name = NamaEmployee;
        this.salary = GajiEmployee;  
    }
    
    // Getter 
    public String getName() {
        return name;
    }

    // Getter
    public double getSalary() {
        return salary;
    }

    // Setter 
        setName(String name) {
        this.name = name;
    }

    // Setter 
    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    // method tdk menghasilkan value
    public void print() {
        System.out.println("Nama: " + name);
        System.out.println("Gaji: " + salary);
    }

    // method yang menghasilkan value
    public String print2() {
        return "Nama : " + name
        + "\nGaji : " + salary;
    }
}

