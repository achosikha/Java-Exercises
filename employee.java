public class employee {

    // String variables
    private String fullName; // emplyee full name
    private String position; // employee position
    private String eMail; // employee e-mail

    // integer variables
    private int telephone; // employee telephone number
    private int salary; // employee salary
    private int age; // employee age

    // constructor
    public employee (String fullName, String position, String eMail,
              int telephone, int salary, int age)
    {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;

        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    // get full name
    public String getFullName() {
        return fullName;
    }

    // get position
    public String getPosition() {
        return position;
    }

    // get e-mail
    public String geteMail() {
        return eMail;
    }

    // get telephone
    public int getTelephone() {
        return telephone;
    }

    //get salary
    public int getSalary() {
        return salary;
    }

    //get age
    public int getAge() {
        return age;
    }

    // get information about the object/class
    public void getObjectInfo ()
    {
        System.out.println ("The object/class - employee - includes data on staff members:");
        System.out.println ("Full Name, Position, E-mail, Telephone, Salary and Age.");
    }
}
