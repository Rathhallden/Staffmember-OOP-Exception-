package inheritance;

    //  create class Hourlylyemployee inherite from Staff member
public class HourlyEmployee extends StaffMember {
    //  declare field of class with Private access modifier
    private int Hourwork;
    private double rate;

    //  create constructor with parameter and use Exception handling to validate when initialize value
    public HourlyEmployee(int id, String name, String address, int hourwork, double rate) throws BonusException, RateException {
        super(id, name, address);
        if (hourwork < 0) {
            throw new BonusException("\n" + "=> Your Initialize Hourwork must bigger than 0 !");
        }
        if (rate < 0) {
            throw new RateException("\n" + "=> Your Initialize Rate must bigger than 0 !");
        }
        this.Hourwork = hourwork;
        this.rate = rate;
    }

    //    create default constructor
    public HourlyEmployee() {
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
                System.out.print("=> Enter Hours worked  :   ");
                Hourwork = cin.nextInt();
                count = 0;
                if (Hourwork < 0)
                    throw new Exception();
            } catch (Exception e) {
                System.out.println("-> INPUT IS INVALID ! (Please Input Integer type)....");
                count++;
            }
            cin.nextLine();
        } while (count != 0);
        do {
            try {
                System.out.print("=> Enter Rate   :   ");
                rate = cin.nextDouble();
                count = 0;
                if (rate < 0)
                    throw new Exception();
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
                System.out.print("=> Enter New Hours worked  :   ");
                Hourwork = cin.nextInt();
                count = 0;
                if (Hourwork < 0)
                    throw new Exception();
            } catch (Exception e) {
                System.out.println("-> INPUT IS INVALID ! (Please Input Integer type)....");
                count++;
            }
            cin.nextLine();
        } while (count != 0);
        do {
            try {
                System.out.print("=> Enter New Rate   :   ");
                rate = cin.nextDouble();
                count = 0;
                if (rate < 0)
                    throw new Exception();
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
        return super.toString() + "Hourwork  : " + Hourwork + "\n" + "Rate  : " + rate + "\n" + "Payment  : " + pay() + "$" + "\n" + "-------------------------";
    }

    //  implement abstract method pay()
    @Override
    double pay() {
        return Hourwork * rate;
    }

    //  implement method compareTo and compare with  name
    @Override
    public int compareTo(StaffMember o) {
        return name.compareTo(o.name);
    }
}
