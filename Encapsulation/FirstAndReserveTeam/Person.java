public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length()<3){
            throw new IllegalStateException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.length()<3){
            throw new IllegalStateException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age<=0){
            throw new IllegalStateException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva.", this.firstName, this.lastName, this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<460){
            throw new IllegalStateException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        if (this.age < 30) {
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 200));
        } else {
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 100));
        }
    }
}
