package case_study.service.impl;

import case_study.model.Person.Employee;
import case_study.model.Person.Person;
import case_study.service.IPersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IPersonService {
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


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
    @Override
    public void edit() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập id cần sửa ");
        String idEdit = scanner.nextLine();
        boolean check = false;
        for (Person employee: employeeList){
            System.out.println(employee.getId());
            if (employee.getId() == idEdit) {
                check = true;
                System.out.println("Chọn phần cần sửa");
                System.out.println("2. name");
                System.out.println("3. dateOfBirth");
                System.out.println("4. sex");
                System.out.println("5. identityCardNo ");
                System.out.println("6. numberPhone");
                System.out.println("7. gmail");
                System.out.println("8. level");
                System.out.println("9. position");
                System.out.println("10. salary");
                int choice = scanner.nextInt();
                scanner.skip("\\R");
                switch (choice){
                    case 2: {
                        System.out.println("sua ten");
                        String nameEdit = scanner.nextLine();
                        employee.setFullName(nameEdit);
                        break;
                    }
                    case 3: {
                        System.out.println("sua ngay sinh");
                        String DayOfBirthEdit = scanner.nextLine();
                        employee.setDayOfBirth(DayOfBirthEdit);
                        break;
                    }
                    case 4: {
                        System.out.println("sua gioi tinh");
                        String sexEdit = scanner.nextLine();
                        employee.setSex(sexEdit);
                        break;
                    }
                    case 5: {
                        System.out.println("sua identityCardNo  ");
                        String identityCardNoEdit  = scanner.nextLine();
                        employee.setIdentityCardNo(identityCardNoEdit);
                        break;
                    }
                    case 6: {
                        System.out.println("sua phoneNo");
                        String phoneNoEdit = scanner.nextLine();
                        employee.setPhoneNo(phoneNoEdit);
                        break;
                    }
                    case 7: {
                        System.out.println("sua email");
                        String emailEdit  = scanner.nextLine();
                        employee.setEmail(emailEdit);
                        break;
                    }
                    case 8: {
                        System.out.println("sua education");
                        String educationEdit = scanner.nextLine();
                        ((Employee) employee).setEducation(educationEdit);
                        break;
                    }
                    case 9: {
                        System.out.println("sua vi tri");
                        String PositionEdit = scanner.nextLine();
                        ((Employee) employee).setPoisition(PositionEdit);
                        break;
                    }
                    case 10: {
                        System.out.println("sua luong");
                        int SalaryEdit = scanner.nextInt();
                        ((Employee) employee).setSalary(SalaryEdit);
                        break;
                    }

                }
            } else if (!check) {
                System.out.println("ID not found!");

            }
                }
            }

        }



