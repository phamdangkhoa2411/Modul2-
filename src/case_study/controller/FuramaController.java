package case_study.controller;

import case_study.service.impl.BookingServiceImpl;
import case_study.service.impl.CustomerServiceImpl;
import case_study.service.impl.EmployeeServiceImpl;
import case_study.service.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        boolean check = true;
        int choice =0;
        while (check) {
            System.out.println("---------Menu--------");
            System.out.println("1.\tEmployee Management: ");
            System.out.println("2.\tCustomer Management: ");
            System.out.println("3.\tFacility Management: ");
            System.out.println("4.\tBooking Management: ");
            System.out.println("5.\tPromotion Management: ");
            System.out.println("6. Exit: ");

            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai dinh dang vui long nhap lai:");
            }
            switch (choice) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    System.exit(6);
                    break;
            }
        }
    }

    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("---------Menu--------");
            System.out.println("1.\tDisplay list employees: ");
            System.out.println("2.\tAdd new employees: ");
            System.out.println("3.\tEdit employee: ");
            System.out.println("4.\tReturn main menu: ");

            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai dinh dang vui long nhap lai:");
            }
            switch (choice) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    displayMenu();
                    break;
            }
        }
    }

    public static void displayCustomerMenu() {
        CustomerServiceImpl customerService =  new CustomerServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("---------Menu--------");
            System.out.println("1.\tDisplay list customers: ");
            System.out.println("2.\tAdd new customers: ");
            System.out.println("3.\tEdit customer: ");
            System.out.println("4.\tReturn main menu: ");

            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai dinh dang vui long nhap lai:");
            }
            switch (choice) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    displayMenu();
                    break;

            }
        }
    }

    public static void displayFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("---------Menu--------");
            System.out.println("1.\tDisplay list facility: ");
            System.out.println("2.\tAdd new facility: ");
            System.out.println("3.\tDisplay list facility maintenance: ");
            System.out.println("4.\tReturn main menu: ");

            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng. Vui lòng nhập lại bằng số:");
            }
            switch (choice) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacilityMenu();
                    break;
                case 4:
                    displayMenu();
                    break;

            }
        }
    }

    public static void addNewFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("---------Menu--------");
            System.out.println("1.\tAdd new Villa: ");
            System.out.println("2.\tAdd new House: ");
            System.out.println("3.\tAdd new Room: ");
            System.out.println("4.\tBack to menu: ");

            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai dinh dang vui long nhap lai:");
            }
            switch (choice) {
                case 1:
//                    facilityService.addNewVilla();
                    displayFacilityMenu();
                    break;
                case 2:
//                    facilityService.adđNewHouse();
                    displayFacilityMenu();
                    break;
                case 3:
//                    facilityService.addNewRoom();
                    displayFacilityMenu();
                    break;
                case 4:
//                    check = false;
                    displayFacilityMenu();
                    break;
            }
        }
    }

    public static void displayBookingMenu() {

        BookingServiceImpl bookingService = new BookingServiceImpl();
//        ContractServiceImpl contractService = new ContractServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("---------Menu--------");
            System.out.println("1.\tAdd new booking: ");
            System.out.println("2.\tDisplay list booking: ");
            System.out.println("3.\tCreate new constracts: ");
            System.out.println("4.\tDisplay list contracts: ");
            System.out.println("5.\tEdit contracts");
            System.out.println("6.\tReturn main menu");

            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng vui lòng nhập lại.:");
            }
            switch (choice) {
                case 1:
//                    bookingService.addNewBooking();
                    displayBookingMenu();
                    break;
                case 2:
//                    bookingService.disPlayListBooking();
                    displayBookingMenu();
                    break;
                case 3:
//                    contractService.createNewConstracts();
                    break;
                case 4:
//                    contractService.disPlayListContact();
                    break;
                case 5:
//                    contractService.editContracts();
                    break;
                case 6:
                    displayMenu();
                    break;
            }
        }
    }

    public static void displayPromotionMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("---------Menu--------");
            System.out.println("1.\tDisplay list customers use service: ");
            System.out.println("2.\tDisplay list customers get voucher: ");
            System.out.println("3.\tReturn main menu: ");

            Scanner scanner = new Scanner(System.in);
            try{
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai dinh dang vui long nhap lai:");
            }
            switch (choice) {
                case 1:
            }
        }
    }
}
