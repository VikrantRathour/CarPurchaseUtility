
package CarPurchase;

import java.util.*;

public class MainClass {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1,"Rajeev"));
        customers.add(new Customer(2,"Ram"));
        customers.add(new Customer(3,"Shyam"));

        int count = 4;



        System.out.println("Press 1 for the Customers List");
        System.out.println("Press 2 to add new customer record");
        System.out.println("Press 3 to remove an existing customer");
        System.out.println("Press 4 to add a car to existing customer");
        System.out.println("Press 0 to exit");
        int input = Integer.parseInt(scan.nextLine());
        do {
            switch (input) {
                case 1:
                    customers.forEach(customer -> {
                        System.out.println("Customer ID : " + customer.getID() + "Name : " + customer.getName());
                    });

                    System.out.println("Press 1 for the Customers List");
                    System.out.println("Press 2 to add new customer record");
                    System.out.println("Press 3 to remove an existing customer");
                    System.out.println("Press 4 to add a car to existing customer");
                    System.out.println("Press 0 to Exit");
                    System.out.println("");
                    input = Integer.parseInt(scan.nextLine());
                    if (input == 0) {
                        break;
                    }
                case 2:
                    while (input == 2) {
                        System.out.println("Enter Customer name :");
                        String name = scan.nextLine();

                        customers.add(new Customer(count, name));
                        count++;
                        System.out.println("Customer Added Successfully!!!!");
                        System.out.println("New Customer List:");
                        customers.forEach(customer -> {
                            System.out.println("Customer ID : " + customer.getID() + "Name : " + customer.getName());
                        });
                        System.out.println("Press 1 for the Customers List");
                        System.out.println("Press 2 to add another Customer");
                        System.out.println("Press 3 to remove an existing customer");
                        System.out.println("Press 4 to add a car to existing customer");
                        System.out.println("Press 0 to Exit");
                        input = Integer.parseInt(scan.nextLine());
                        if (input == 0) {
                            break;
                        }

                    }
                case 3:
                    while (input == 3) {
                        customers.forEach(customer -> {
                            System.out.println("Customer ID : " + customer.getID() + "Name : " + customer.getName());
                        });
                        System.out.println("Enter Customer ID to be removed : ");
                        int del = Integer.parseInt(scan.nextLine());

                        for (int i = 0; i < customers.size(); i++) {
                            if (del == customers.get(i).getID()) {

                                customers.remove(customers.get(i));
                            }
                        }


                        System.out.println("New Customer List : ");
                        customers.forEach(customer -> {
                            System.out.println("Customer ID : " + customer.getID() + "Name : " + customer.getName());
                        });
                        System.out.println("Press 1 for the Customers List");
                        System.out.println("Press 2 to add another Customer");
                        System.out.println("Press 3 to remove another Customer : ");
                        System.out.println("Press 4 to add a car to existing customer");
                        System.out.println("Press 0 to exit");
                        input = Integer.parseInt(scan.nextLine());


                    }
                case 4:
                    System.out.println("Enter customer id");
                    int addCar = Integer.parseInt(scan.nextLine());
                    Car car = null;
                    for (int i = 0; i < customers.size(); i++) {
                        if (addCar == customers.get(i).getID()) {
                            System.out.println("Press 1 to add Maruti");
                            System.out.println("Press 2 to add Toyota");
                            System.out.println("Press 3 to add Hyundai");
                            int model = Integer.parseInt(scan.nextLine());
                            String carModel;
                            int carPrice;
                            ArrayList<Car> carlist;
                            switch (model) {
                                case 1:
                                    System.out.println("Enter car model:");
                                    carModel = scan.nextLine();
                                    System.out.println("Enter car price");
                                    carPrice = Integer.parseInt(scan.nextLine());
                                    Customer c = customers.get(i);
                                    if (c.getID() == addCar) {
                                        car = new Maruti(carModel, carPrice);
                                        carlist = new ArrayList<Car>();
                                        carlist.add(car);
                                        c.setCars(carlist);
                                    }
                                    break;
                                case 2:
                                    System.out.println("Enter car model:");
                                    carModel = scan.nextLine();
                                    System.out.println("Enter car price");
                                    carPrice = Integer.parseInt(scan.nextLine());
                                    c = customers.get(i);
                                    if (c.getID() == addCar) {
                                        car = new Toyota(carModel, carPrice);
                                        carlist = new ArrayList<Car>();
                                        carlist.add(car);
                                        c.setCars(carlist);
                                    }
                                    break;
                                case 3:
                                    System.out.println("Enter car model:");
                                    carModel = scan.nextLine();
                                    System.out.println("Enter car price");
                                    carPrice = Integer.parseInt(scan.nextLine());
                                    c = customers.get(i);
                                    if (c.getID() == addCar) {
                                        car = new Hyundai(carModel, carPrice);
                                        carlist = new ArrayList<Car>();
                                        carlist.add(car);
                                        c.setCars(carlist);
                                    }
                                    break;

                            }
                            System.out.println("New Customer List : ");
                            customers.forEach(customer -> {
                                System.out.println("Customer ID : " + customer.getID() + "Name : " + customer.getName());
                                for (Car c : customer.getCars()) {
                                    System.out.println("Car : " + c.carModel + ", Price : " + c.carPrice);
                                }
                            });
                            System.out.println("Press 1 for the Customers List");
                            System.out.println("Press 2 to add another Customer");
                            System.out.println("Press 3 to remove another Customer : ");
                            System.out.println("Press 4 to add a car to existing customer");
                            System.out.println("Press 0 to exit");


                        }
                    }
                case 0:
                    break;
                default:
                    System.out.println("Invalid Entry");
                    break;
            }
        }while(input != 0);








    }

}
