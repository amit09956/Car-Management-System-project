import java.util.Scanner;


public class Employee extends Showroom implements utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override

    public void get_details() {
        System.out.println("CAR NAME" + car_name);
        System.out.println("CAR COLOR" + car_color);
        System.out.println("CAR FUEL TYPE:" + car_fuel_type);
        System.out.println("CAR PRICE:" + car_price);
        System.out.println("CAR TYPE" + car_type);
        System.out.println("CAR TRANSMISSION" + car_transmission);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============== *** ENTER CAR DETAILS *** =================");
        System.out.println("ENTER CAR NAME:");
        car_name = sc.nextLine();
        System.out.println("ENTER CAR COLOR:");
        car_color = sc.nextLine();
        System.out.println("ENTER CAR FUEL TYPE(PETROL/DESEL)");
        car_fuel_type = sc.nextLine();
        System.out.println("ENTER CAR PRICE");
        car_price = sc.nextInt();
        System.out.println("ENTER CAR TYPE(THAR/SUV/TATA/HUNDAI/BMW)");
        car_type = sc.nextLine();
        System.out.println("ENTER TRANSMISSION TYPE(AUUTOMATIC/MANUAL)");
        car_transmission = sc.nextLine();
        total_cars_in_stock++;
    }

}

