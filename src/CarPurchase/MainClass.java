package CarPurchase;

import java.util.*;

public class MainClass {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Rajeev", 1, "Toyota", 1000000));
        customers.add(new Customer("Ram", 2, "Maruti", 500000));
        customers.add(new Customer("Shyam", 3, "Hyundai", 800000));

        int count = 4;



        System.out.println("Press 1 for the Customers List");
        System.out.println("Press 2 to add new customer record");
        System.out.println("Press 3 to remove an existing customer");
        System.out.println("Press 0 to exit");
        int input = Integer.parseInt(scan.nextLine());
        switch (input){
            case 1:
                customers.forEach(customer -> {
                    System.out.println("Name : " + customer.getName() + ", Customer ID : " + customer.getID() + ", Car Purchased : " + customer.getCarName() + ", Price of the Car : Rs." + customer.getCarPrice());
                });

                System.out.println("Press 2 to add new customer record");
                System.out.println("Press 3 to remove an existing customer");
                System.out.println("Press 0 to Exit");
                System.out.println("");
                input = Integer.parseInt(scan.nextLine());
                if (input == 0){
                    break;
                }
            case 2:
                while(input == 2) {
                    System.out.println("Enter Customer name :");
                    String name = scan.nextLine();

                    System.out.println("Enter Customer Car Name :");
                    String carName = scan.nextLine();

                    System.out.println("Enter Customer Car Price :");
                    int carPrice = Integer.parseInt(scan.nextLine());

                    customers.add(new Customer(name, count, carName, carPrice));
                    count++;
                    System.out.println("Customer Added Successfully!!!!");
                    System.out.println("New Customer List:");
                    customers.forEach(customer -> {
                        System.out.println("Name : " + customer.getName() + ", Customer ID : " + customer.getID() + ", Car Purchased : " + customer.getCarName() + ", Price of the Car : Rs." + customer.getCarPrice());
                    });
                    System.out.println("Press 2 to add another Customer");
                    System.out.println("Press 3 to remove an existing customer");
                    System.out.println("Press 0 to Exit");
                    input = Integer.parseInt(scan.nextLine());
                    if (input == 0){
                        break;
                    }

                }
            case 3:
                while (input == 3){
                    customers.forEach(customer -> {
                        System.out.println("Name : " + customer.getName() + ", Customer ID : " + customer.getID() + ", Car Purchased : " + customer.getCarName() + ", Price of the Car : Rs." + customer.getCarPrice());
                    });
                    System.out.println("Enter Customer ID to be removed : ");
                    int del = Integer.parseInt(scan.nextLine());

                    for (int i = 0; i < customers.size(); i++) {
                        if (del == customers.get(i).getID()){

                            customers.remove(customers.get(i));
                        }
                    }




                    System.out.println("New Customer List : ");
                    customers.forEach(customer -> {
                        System.out.println("Name : " + customer.getName() + ", Customer ID : " + customer.getID() + ", Car Purchased : " + customer.getCarName() + ", Price of the Car : Rs." + customer.getCarPrice());
                    });
                    System.out.println("Press 3 to remove another Customer : ");
                    System.out.println("Press 0 to exit");
                    input = Integer.parseInt(scan.nextLine());



                }
            case 0:
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }








    }

}
