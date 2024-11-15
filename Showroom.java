import java.sql.SQLOutput;
import java.util.*;

public class Showroom implements utility {
    String showroom_name;
    String showroom_address;
    int total_employee;
    int total_cars_in_stock = 0;
    String manager_namne;

    @Override
    public void get_details() {
        System.out.println(" SHOWROOM     NAME" + showroom_name);
        System.out.println(" SHOWROOM    ADDRESS" + showroom_address);
        System.out.println(" TOTAL   EMPLOYEE" + total_employee);
        System.out.println("TOATL COST IN STOCK" + total_cars_in_stock);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================== *** ENTER SHOWROOM DETAILS *** ===================");
        System.out.println("ENTER SHOWROOM NAME");
        showroom_name = sc.nextLine();
        System.out.println("ENTER SHOWROOM ADDRESS");
        showroom_address = sc.nextLine();
        System.out.println("ENTER TOTAL EMPLIOYEE");
        total_employee = sc.nextInt();
        System.out.println("ENTER TOTAL COST IN STOCK");
        total_cars_in_stock = sc.nextInt();
    }
}

