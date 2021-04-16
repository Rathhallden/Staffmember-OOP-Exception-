package inheritance;

    // create volunteer class inherite from Staff member
public class Volunteer extends StaffMember {
    //  create constructor with parameter
    public Volunteer(int id, String name, String address) {
        super(id, name, address);
    }

    //    create default constructor
    public Volunteer() {
    }

    //  implement abstract method pay()
    @Override
    double pay() {
        return 0.00;
    }

    // implement abstract method addNew() and use Exception handling to validate
    @Override
    void addNew() {
        int count = 0;
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
    }

    //  override tostring
    @Override
    public String toString() {
        return super.toString() + "-------------------------";
    }

    //  implement method compareTo and compare by name
    @Override
    public int compareTo(StaffMember o) {
        return name.compareTo(o.name);
    }
}
