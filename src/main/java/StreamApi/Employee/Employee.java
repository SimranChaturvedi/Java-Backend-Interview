package StreamApi.Employee;

 class Employee {
     int id;
     String name;
     String designation;
     double salary;
     String location;

     String department;

     public Employee(int id, String name, String designation, double salary, String location,String department) {
         this.id = id;
         this.name = name;
         this.designation = designation;
         this.salary = salary;
         this.location = location;
         this.department=department;
     }

     public String getDesignation() {
         return designation;
     }

     public double getSalary() {
         return salary;
     }

     public String getDepartment() {
         return department;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", designation='" + designation + '\'' +
                 ", salary=" + salary +
                 ", location='" + location + '\'' +
                 ", department='" + department + '\'' +
                 '}';
     }
 }