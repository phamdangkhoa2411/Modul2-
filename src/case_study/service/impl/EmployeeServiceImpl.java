package case_study.service.impl;

import case_study.model.Person.Employee;
import case_study.service.IPersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IPersonService {
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {
        System.out.println("Nhập id ");

    }

    @Override
    public void addNew() {
        System.out.println("nhập id");
        String id = scanner.nextLine();
        System.out.println("nhập fullName");
        String fullName = scanner.nextLine();
        System.out.println("nhập dayOfBirth");
        String dayOfBirth = scanner.nextLine();
        System.out.println("nhập sex ");
        String sex = scanner.nextLine();
        System.out.println("nhập  identityCardNo ");
        String  identityCardNo = scanner.nextLine();
        System.out.println("nhập phoneNo");
        String phoneNo = scanner .nextLine();
        System.out.println("nhập email ");
        String email = scanner.nextLine();
        System.out.println("nhập education");
        String education = scanner.nextLine() ;
        System.out.println("nhập poisition");
        String poisition = scanner.nextLine();
        System.out.println("nhập salary");
        double salary = scanner.nextDouble();
        Employee employee = new Employee(id,fullName,dayOfBirth,sex,identityCardNo,phoneNo,email,education,poisition,salary);
        employeeList.add(employee);


    }

    @Override
    public void display() {
        for (Employee employee:employeeList) {
            System.out.println(employee);

        }

    }
}
