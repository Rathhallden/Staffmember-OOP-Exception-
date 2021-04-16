package inheritance;

import java.util.Scanner;

    //declare abstract class and implement with comparable
public abstract class StaffMember implements Comparable<StaffMember> {
    //  declare Class Scanner as global
    Scanner cin = new Scanner(System.in);
    //  declare field of class with protected access modifier
    protected int id;
    protected String name, address;

    //  create constructor with parameter
    public StaffMember(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    //    create default constructor
    public StaffMember() {
    }

    // generate Set & get
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Override tostring
    @Override
    public String toString() {
        return "\n" + "ID  : " + id + "\n" + "Name  : " + name + "\n" + "Address  : " + address + "\n";
    }

    //  declare abstract method
    abstract double pay();

    abstract void addNew();

    abstract void update();
}
