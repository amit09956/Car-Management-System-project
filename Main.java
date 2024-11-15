import java.util.*;

interface utility {
    public void get_details();

    public void set_details();

}

public class Main {
    public static void main_menu() {
        System.out.println();
        System.out.println("=================== *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =================");
        System.out.println();
        System.out.println("=================== *** ENTER YOUR CHOICE *** ====================");
        System.out.println();
        System.out.println("1.ADD SHOWROOM\t\t\t2.ADD EMPLOYEE\t\t\t3.ADD CARS");
        System.out.println();
        System.out.println("4.GET SHOWROOM\t\t\t5.GET EMPLOYEE\t\t\t6.GET CARS");
        System.out.println();
        System.out.println("=================== *** ENTER   0  TO  EXIT *** ===================");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employee employee[] = new Employee[5];
        Cars cars[] = new Cars[5];
        int showroom_counter = 0;
        int cars_counter = 0;
        int employee_counter = 0;
        int choice = 100;
        while (choice != 0) {
            main_menu();

            choice = sc.nextInt();
            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1.ADD NEW SHOWROOM");
                        System.out.println("9.GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employee_counter] = new Employee();
                        employee[employee_counter].set_details();
                        employee_counter++;
                        System.out.println();
                        System.out.println("2.ADD  NEW EMPLOYEE");
                        System.out.println("9.GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        cars[cars_counter] = new Cars();
                        cars[cars_counter].set_details();
                        cars_counter++;
                        System.out.println();
                        System.out.println("2.ADD NEW CARS");
                        System.out.println("9.GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroom_counter; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9.GO BACK TO MAIN MENU");
                        System.out.println("0.EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employee_counter; i++) {
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9.GO BACK TO MAIN MENU");
                        System.out.println("0.EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < cars_counter; i++) {
                            cars[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9.GO BACK TO MAIN MENU");
                        System.out.println("0.EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER THE VALID CHOICE");
                        break;

                }
            }
        }

    }

}

