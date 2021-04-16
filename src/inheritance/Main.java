package inheritance;

import com.sun.source.tree.Tree;

import javax.swing.text.TabExpander;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
//        handle exception and create object from class employee and class function menu fordisplay
        try {
            Employee employee = new Employee();
            employee.menu();
        } catch (SalaryFormatException s) {
            System.out.println(s.getMessage());
        } catch (BonusException b) {
            System.out.println(b.getMessage());
        } catch (HourworkException h) {
            System.out.println(h.getMessage());
        } catch (RateException r) {
            System.out.println(r.getMessage());
        }
    }
}
