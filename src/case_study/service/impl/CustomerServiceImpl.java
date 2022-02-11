package case_study.service.impl;

import case_study.model.Person.Customer;
import case_study.model.Person.Person;
import case_study.service.ICustomerService;


import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    static List<Customer> customerList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static {
        customerList=readerCustomer();
    }

    public void write(){
        try{
            FileWriter fileWriter = new FileWriter("E:\\Codegym\\Modul2\\src\\case_study\\data\\customer.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.getId()+","+customer.getFullName()+","+customer.getDayOfBirth()+","+customer.getSex()+","+customer.getIdentityCardNo()+","
                        +customer.getPhoneNo()+","+customer.getEmail()+","+customer.getCustomerType()+","+customer.getAddress());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    public static List<Customer> readerCustomer(){
        try {
            FileReader fileReader = new FileReader(new File("E:\\Codegym\\Modul2\\src\\case_study\\data\\customer.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            String[] temp ;
            while ((line=bufferedReader.readLine())!=null){
                temp = line.split(",");
                Customer customer = new Customer(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7],temp[8]);
                customerList.add(customer);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void addNewCustomer() {

            System.out.println("nhập id");
            String id = scanner.nextLine();
            System.out.println("nhập fullName");
            String fullName = scanner.nextLine();
            System.out.println("nhập dayOfBirth");
            String dayOfBirth = scanner.nextLine();
            System.out.println("nhập sex ");
            String sex = scanner.nextLine();
            System.out.println("nhập  identityCardNo ");
            String identityCardNo = scanner.nextLine();
            System.out.println("nhập phoneNo");
            String phoneNo = scanner.nextLine();
            System.out.println("nhập email ");
            String email = scanner.nextLine();
            System.out.println("nhập customerType");
            String customerType = scanner.nextLine();
            System.out.println("nhập  address");
            String address = scanner.nextLine();
            Customer customer = new Customer(id, fullName, dayOfBirth, sex, identityCardNo, phoneNo, email,customerType,address);
            customerList.add(customer);
            write();
        System.out.println("đã thêm mới thành công");


    }

    @Override
    public void displayCustomer() {
        for (Customer customer:customerList) {
            System.out.println(customer);

        }

    }
    @Override
    public void editCustomer() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập id cần sửa ");
        String idEdit = scanner.nextLine();
        boolean check = false;
        for (Person customer : customerList ){
            System.out.println(customer.getId());
            if (customer.getId() == idEdit) {
                check = true;
                System.out.println("Chọn phần cần sửa");
                System.out.println("2. name");
                System.out.println("3. dateOfBirth");
                System.out.println("4. sex");
                System.out.println("5. identityCardNo ");
                System.out.println("6. numberPhone");
                System.out.println("7. gmail");
                System.out.println("8.  customerType");
                System.out.println("9. address");

                int choice = scanner.nextInt();
                scanner.skip("\\R");
                switch (choice){
                    case 2: {
                        System.out.println("sua ten");
                        String nameEdit = scanner.nextLine();
                        customer.setFullName(nameEdit);
                        break;
                    }
                    case 3: {
                        System.out.println("sua ngay sinh");
                        String DayOfBirthEdit = scanner.nextLine();
                        customer.setDayOfBirth(DayOfBirthEdit);
                        break;
                    }
                    case 4: {
                        System.out.println("sua gioi tinh");
                        String sexEdit = scanner.nextLine();
                        customer.setSex(sexEdit);
                        break;
                    }
                    case 5: {
                        System.out.println("sua identityCardNo  ");
                        String identityCardNoEdit  = scanner.nextLine();
                        customer.setIdentityCardNo(identityCardNoEdit);
                        break;
                    }
                    case 6: {
                        System.out.println("sua phoneNo");
                        String phoneNoEdit = scanner.nextLine();
                        customer.setPhoneNo(phoneNoEdit);
                        break;
                    }
                    case 7: {
                        System.out.println("sua email");
                        String emailEdit  = scanner.nextLine();
                        customer.setEmail(emailEdit);
                        break;
                    }
                    case 8: {
                        System.out.println("sua  customerType");
                        String  customerTypeEdit = scanner.nextLine();
                        ((Customer) customer).setCustomerType( customerTypeEdit);
                        break;
                    }
                    case 9: {
                        System.out.println("sua  address");
                        String  addressEdit = scanner.nextLine();
                        ((Customer) customer).setAddress( addressEdit);
                        break;
                    }

                }
            } else if (!check) {
                System.out.println("ID not found!");

            }
        }

    }

}
