package inheritance;

    //  create class SalaryEmployee inherite from Staff member
class SalaryEmployee extends StaffMember {
    //  declare field of class with Private access modifier
    private double salary, bonus;

    //  create constructor with parameter and use Exception handling to validate when initialize value
    public SalaryEmployee(int id, String name, String address, double salary, double bonus) throws SalaryFormatException, BonusException {
        super(id, name, address);
        if (salary < 0) {
            throw new SalaryFormatException("\n" + "=>Your Initialize Salary must bigger than 0 !");
        }
        if (bonus < 0) {
            throw new BonusException("\n" + "=> Your Initialize Bonus must bigger than 0 !");
        }

        this.salary = salary;
        this.bonus = bonus;
    }

    //    create default constructor
    public SalaryEmployee() {
    }

    // implement abstract method addNew() and use Exception handling to validate
    int count = 0;

    @Override
    void addNew() {
        do {
            try {
                System.out.print("=> Enter Staff Member's ID      :  ");
                id = cin.nextInt();
                count = 0;
                if (id < 0)
                    throw new Exception();
            } catch (Exception e) {
                System.out.println("-> INPUT IS INVALID ! (Please Input Integer type)....");
                count++;
            }
            cin.nextLine();
        } while (count != 0);
        do {
            System.out.print("=> Enter Staff Member's Name    :  ");
            name = cin.nextLine();
            if (Regex.onlystring(name))
                System.out.println("-> INPUT IS INVALID ! (Please Input String type)....");
        } while (Regex.onlystring(name));
        do {
            System.out.print("=> Enter Staff Member's Address :  ");
            address = cin.nextLine();
            if (Regex.onlystring(address))
                System.out.println("-> INPUT IS INVALID ! (Please Input String type)....");
        } while (Regex.onlystring(address));
        do {
            try {
                System.out.print("=> Enter New Salary  :  ");
                salary = cin.nextDouble();
                count = 0;
                if (salary < 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("-> INPUT IS INVALID ! (Please Input Double type)....");
                count++;
            }
            cin.nextLine();
        } while (count != 0);
        do {
            try {
                System.out.print("=> Enter New Bonus   :  ");
                bonus = cin.nextDouble();
                count = 0;
                if (bonus < 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("-> INPUT IS INVALID ! (Please Input Double type)....");
                count++;
            }
            cin.nextLine();
        } while (count != 0);
    }

    //  implement abstract method update and use Exception handling to validate
    @Override
    void update() {
        do {
            System.out.print("=> Enter Staff Member's Name    :  ");
            name = cin.nextLine();
            if (Regex.onlystring(name))
                System.out.println("-> INPUT IS INVALID ! (Please Input String type)....");
        } while (Regex.onlystring(name));
        do {
            try {
                System.out.print("=> Enter Salary  :  ");
                salary = cin.nextDouble();
                count = 0;
                if (salary < 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("-> INPUT IS INVALID ! (Please Input Double type)....");
                count++;
            }
            cin.nextLine();
        } while (count != 0);
        do {
            try {
                System.out.print("=> Enter Bonus   :  ");
                bonus = cin.nextDouble();
                count = 0;
                if (bonus < 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("-> INPUT IS INVALID ! (Please Input Double type)....");
                count++;
            }
            cin.nextLine();
        } while (count != 0);
    }

    //  override tostring
    @Override
    public String toString() {
        return super.toString() + "Salary  : " + salary + "\n" + "Bonus  : " + bonus + "\n" + "Payment  : " + pay() + "$" + "\n" + "-------------------------";
    }

    //  implement abstract method pay()
    @Override
    double pay() {
        return salary + bonus;
    }

    //  implement method compareTo and compare with name
    @Override
    public int compareTo(StaffMember o) {
        return name.compareTo(o.name);
    }
}
