package inheritance;

import java.util.*;

//create class Employee without extend from other class
public class Employee {
    //  declare Class Scanner as global
    static Scanner cin = new Scanner(System.in);
    //    declare Set collection and use Super class Staffmember as datatype (because can add all subclass to our Treeset)
    Set<StaffMember> obj;

    //    create default constructor and throws Exception to main method
    public Employee() throws SalaryFormatException, BonusException, HourworkException, RateException {
        //  initialize object with Treeset collection
        obj = new TreeSet<>();
        //  call initailzeemployee method()
        initalizeemployee();
    }

    //  create method initialze for initialize with constructor and throws exception to default construtor
    public void initalizeemployee() throws SalaryFormatException, BonusException, HourworkException, RateException {
        //  i give Staffmember class reference subclass and create object initialize with constructor paramet
        StaffMember volunteer = new Volunteer(1, "narath", "PP");
        StaffMember salaryemployee = new SalaryEmployee(2, "kaka", "PP", 90, 4.5);
        StaffMember hourlyemployee = new HourlyEmployee(3, "koko", "PP", 2, 5.1);
        //  add these object to our treeset
        obj.add(volunteer);
        obj.add(salaryemployee);
        obj.add(hourlyemployee);
    }

    //  create method insertvolunteer() for Add Employee volunteer
    public void insertVolunteer() {
        System.out.println("================ INSERT INFO ==============");
        //  create object from class Volunteer and initialize with default constructor
        Volunteer vl = new Volunteer();
        //  call method addnew from volenteer class
        vl.addNew();
        //  add to treeset
        obj.add(vl);
    }

    //  create method insertsalaryemployee() for Add salaryemployee
    public void insertSalaryemployee() {
        //  create object from class SalaryEmployee and initialize with default constructor
        SalaryEmployee sl = new SalaryEmployee();
        //  call method addnew from SalaryEmployee class
        sl.addNew();
        //   add to treeset
        obj.add(sl);
    }

    //  create method insertHourlyemployee() for Add Hourlyemployee
    public void insertHourlyemployee() {
        //  create object from class Hourlyemployee and initialize with default constructor
        HourlyEmployee hl = new HourlyEmployee();
        //  call method addnew from Hourlyemployee class
        hl.addNew();
        //  add to treeset
        obj.add(hl);
    }

    //  create method menu() for create menu can call function that related
    public void menu() {
        int choose = 0;
        do {
            System.out.println("\n" + "================( StaffMember Management System )==============");
            System.out.println("1- Add Employee");
            System.out.println("2- Display");
            System.out.println("3- Update");
            System.out.println("4- Remove");
            System.out.println("5- exit");
            System.out.println("================================================================");
            try {
                System.out.print("=> Choose option [1-5] : ");
                choose = cin.nextInt();
            } catch (Exception e) {
            }
            cin.nextLine();
            switch (choose) {
                case 1:
                    int choose2 = 0, count = 0;
                    do {
                        System.out.println("\n" + "1).Volunteer" + "\t" + "2).SalaryEmployee" + "\t" + "3).HourlyEmployee" + "\t" + "0).Back");
                        System.out.println("----------------------------------------------------------------");
                        try {
                            System.out.print("=> choose option [0-3] : ");
                            choose2 = cin.nextInt();
                            count = 0;
                        } catch (Exception e) {
                            System.out.println("=> INPUT IS INVALID !");
                            count++;
                        }
                        cin.nextLine();
                    } while (count != 0);

                    switch (choose2) {
                        case 1:
                            insertVolunteer();
                            break;
                        case 2:
                            insertSalaryemployee();
                            break;
                        case 3:
                            insertHourlyemployee();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("=> INPUT IS INVALID ! ");
                            break;
                    }
                    break;
                case 2:
                    showemployee();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    removeemployee();
                    break;
                case 5:
                    System.out.println("-> good bye !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("=> INPUT IS INVALID !");
            }
        } while (true);
    }

    //  create method update for update employee
    public void update() {
        int newid = 0, count = 0;
        String newname;
        System.out.println("\n" + "================ EDIT INFO ================");
        //  use exception handling for validate id
        do {
            try {
                System.out.print("=> Enter Employee ID to Update  :  ");
                newid = cin.nextInt();
                count = 0;
                if (newid < 0)
                    throw new Exception();
            } catch (Exception e) {
                System.out.println("-> INPUT IS INVALID ! (Please Input Integer type)....");
                count++;
            }
            cin.nextLine();
        } while (count != 0);
        for (StaffMember tmp : obj) {
            //  if user input id equal any id of our collection then call method update
            if (newid == tmp.getId()) {
                //  call tostring for display data
                System.out.println(tmp.toString());
                System.out.println("\n" + "------------ NEW INFO OF STAFF MEMBER ------------");
                tmp.update();
                System.out.println("=> Update Successfully....");
                count++;
            }
        }
        if (count == 0)
            System.out.println("=> ID : " + newid + " IS NOT EXIST...");
    }

    //  create method Remove for remove employee
    public void removeemployee() {
        int newid = 0, count = 0;
        System.out.println("\n" + "================ DELETE STAFF MEMBER ================");
        //    use exception handling for validate id
        do {
            try {
                System.out.print("=> Enter Employee ID to Delete  :  ");
                newid = cin.nextInt();
                count = 0;
                if (newid < 0)
                    throw new Exception();
            } catch (Exception e) {
                System.out.println("-> INPUT IS INVALID ! (Please Input Integer type)....");
                count++;
            }
            cin.nextLine();
        } while (count != 0);
        //use interator instead loop to avoid concurrentmodification exception
        Iterator<StaffMember> it = obj.iterator();
        while (it.hasNext()) {
            StaffMember tmp = it.next();
            //  if user input id equal any id of our collection then remove it
            if (newid == tmp.getId()) {
                //  call tostring for display data
                System.out.println(tmp.toString());
                it.remove();
                System.out.println("=> Remove Successfully !");
                count++;
            }
        }
        if (count == 0)
            System.out.println("=> ID : " + newid + " IS NOT EXIST...");

    }

    //create showemployee for display Employee
    public void showemployee() {
        System.out.println("\n" + "================ EDIT INFO ================");
        for (StaffMember staffMember : obj) {
            System.out.println(staffMember.toString());
        }
    }

}