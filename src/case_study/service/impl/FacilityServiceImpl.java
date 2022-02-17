package case_study.service.impl;

import case_study.model.FacilityFurama.Facility;
import case_study.model.FacilityFurama.House;
import case_study.model.FacilityFurama.Room;
import case_study.model.FacilityFurama.Villa;
import case_study.service.IFacilityService;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        readerVilla();
        readerHouse();
        readerRoom();
    }

    public void write() {
        try {
            FileWriter fileWriterVilla = new FileWriter("E:\\Codegym\\Modul2\\src\\case_study\\data\\facilityvilla.csv");
            FileWriter fileWriterHouse = new FileWriter("E:\\Codegym\\Modul2\\src\\case_study\\data\\facilityhouse.csv");
            FileWriter fileWriterRoom = new FileWriter("E:\\Codegym\\Modul2\\src\\case_study\\data\\facilityroom.csv");
            BufferedWriter bufferedWriterVilla = new BufferedWriter(fileWriterVilla);
            BufferedWriter bufferedWriterHouse = new BufferedWriter(fileWriterHouse);
            BufferedWriter bufferedWriterRoom = new BufferedWriter(fileWriterRoom);
            for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
                if (element.getKey() instanceof Villa) {
                    Villa villa = (Villa) element.getKey();
                    bufferedWriterVilla.write(villa.getQuantityOfBooking() + "," + villa.getServiceName()
                            + "," + villa.getCodeService() + "," + villa.getAreaUsable() + "," + villa.getRent() + "," + villa.getMaxPeople() + "," + villa.getRentType()
                            + "," + villa.getRoomStandard() + "," + villa.getPoolArea() + "," + villa.getQuantityOfFloor());
                    bufferedWriterVilla.newLine();
                    bufferedWriterVilla.close();
                } else if (element.getKey() instanceof House) {
                    House house = (House) element.getKey();
                    bufferedWriterHouse.write(house.getQuantityOfBooking() + "," + house.getServiceName() + "," + house.getCodeService() + "," + house.getAreaUsable() + "," + house.getRent() + "," + house.getMaxPeople() + "," + house.getRentType() + "," + house.getRoomStandard() + "," + house.getQuantityOfFloor());
                    bufferedWriterHouse.newLine();
                    bufferedWriterHouse.close();
                } else if (element.getKey() instanceof Room) {
                    Room room = (Room) element.getKey();
                    bufferedWriterRoom.write(room.getQuantityOfBooking() + "," + room.getServiceName() + "," + room.getCodeService() + "," +
                            room.getAreaUsable() + "," + room.getRent() + "," + room.getMaxPeople() + "," + room.getRentType() + "," + room.getFreeService());
                    bufferedWriterRoom.newLine();
                    bufferedWriterRoom.close();
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Facility, Integer> readerVilla() {
        Map<Facility, Integer> entry = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader(new File("E:\\Codegym\\Modul2\\src\\case_study\\data\\facilityvilla.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Villa villa = null;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                villa = new Villa(Integer.parseInt(temp[0]), temp[1], temp[2], Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), temp[6], temp[7], Integer.parseInt(temp[8]), Integer.parseInt(temp[9]));
                entry.put(villa, 1);
            }
            if (villa != null) {
                entry.put(villa, 1);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entry;
    }

    public static Map<Facility, Integer> readerHouse() {
        Map<Facility, Integer> entryHouse = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader(new File("E:\\Codegym\\Modul2\\src\\case_study\\data\\facilityhouse.csv"));
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            String[] temp;
            House house = null;
            while ((line = br.readLine()) != null) {
                temp = line.split(",");
                house = new House(Integer.parseInt(temp[0]), temp[1], temp[2], Integer.parseInt(temp[3]), Integer.parseInt(temp[4])
                        , Integer.parseInt(temp[5]), temp[6], temp[7], Integer.parseInt(temp[8]));
                entryHouse.put(house, 1);
            }
            if (house != null) {
                entryHouse.put(house, 1);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entryHouse;
    }

    public static Map<Facility, Integer> readerRoom() {
        Map<Facility, Integer> entryRoom = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader(new File("E:\\Codegym\\Modul2\\src\\case_study\\data\\facilityroom.csv"));
            BufferedReader br1 = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Room room = null;
            while ((line = br1.readLine()) != null) {
                temp = line.split(",");
                room = new Room(Integer.parseInt(temp[0]), temp[1], temp[2], Integer.parseInt(temp[3]),
                        Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), temp[6], temp[7]);
                entryRoom.put(room, 1);
            }
            if (room != null) {
                entryRoom.put(room, 1);
            }
            br1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entryRoom;
    }


    @Override
    public void displayFacilityService() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("dich vu: " + element.getKey() + "so lan thue da thue: " + element.getValue());
        }

    }

    @Override
    public void addMaintian() {

    }

    @Override
    public void addNewVilla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap số lượng đặt trước");
        int quantityOfBooking = Integer.parseInt(scanner.nextLine());
        System.out.println("Hay nhap Tên dịch vụ");
        String serviceName = scanner.nextLine();
        System.out.println("Hay nhap mã dịch vụ");
        String codeService = scanner.nextLine();
        System.out.println("Hay khu vuc có thể sử dụng");
        double areaUsable = Double.parseDouble(scanner.nextLine());
        System.out.println("Hay nhap thue");
        int rent = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap số người tối đa  ");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập kiểu thuế");
        String rentType = scanner.nextLine();
        System.out.println("Hay nhap tieu chuan phong");
        String roomStandard = scanner.nextLine();
        System.out.println("Hay nhap dien tich be boi");
        double poolArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Hay nhap so tang");
        int quantityOfFloor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(quantityOfBooking, serviceName, codeService,
                areaUsable, rent, maxPeople, rentType, roomStandard, poolArea, quantityOfFloor);
        facilityIntegerMap.put(villa, 0);
        write();
    }

    @Override
    public void addNewHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap số lượng đặt trước");
        int quantityOfBooking = Integer.parseInt(scanner.nextLine());
        System.out.println("Hay nhap Tên dịch vụ");
        String serviceName = scanner.nextLine();
        System.out.println("Hay nhap mã dịch vụ");
        String codeService = scanner.nextLine();
        System.out.println("Hay khu vuc có thể sử dụng");
        double areaUsable = Double.parseDouble(scanner.nextLine());
        System.out.println("Hay nhap thue");
        int rent = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap số người tối đa  ");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập kiểu thuế");
        String rentType = scanner.nextLine();
        System.out.println("Hay nhap tieu chuan phong");
        String roomStandard = scanner.nextLine();
        System.out.println("Hay nhap so tang");
        int quantityOfFloor = Integer.parseInt(scanner.nextLine());
        House house = new House(quantityOfBooking, serviceName, codeService,
                areaUsable, rent, maxPeople, rentType, roomStandard, quantityOfFloor);
        facilityIntegerMap.put(house, 0);
        write();

    }

    @Override
    public void addNewRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap số lượng đặt trước");
        int quantityOfBooking = Integer.parseInt(scanner.nextLine());
        System.out.println("Hay nhap Tên dịch vụ");
        String serviceName = scanner.nextLine();
        System.out.println("Hay nhap mã dịch vụ");
        String codeService = scanner.nextLine();
        System.out.println("Hay khu vuc có thể sử dụng");
        double areaUsable = Double.parseDouble(scanner.nextLine());
        System.out.println("Hay nhap thue");
        int rent = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap số người tối đa  ");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập kiểu thuế");
        String rentType = scanner.nextLine();
        System.out.println("nhập dịch vụ miễn phí");
        String freeService = scanner.nextLine();
        Room room = new Room(quantityOfBooking, serviceName, codeService,
                areaUsable, rent, maxPeople, rentType,freeService);
        facilityIntegerMap.put(room,0);
        write();

    }
}
