package case_study.model.FacilityFurama;

public class House extends Facility {
    private String roomStandard;
    private  int quantityOfFloor;

    public House() {
    }

    public House(int quantityOfBooking, String serviceName, String codeService, double areaUsable, int rent, int maxPeople, String rentType, String roomStandard, int quantityOfFloor) {
        super(quantityOfBooking,serviceName,codeService,areaUsable,rent,maxPeople,rentType);
        this.roomStandard = roomStandard;
        this.quantityOfFloor = quantityOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getQuantityOfFloor() {
        return quantityOfFloor;
    }

    public void setQuantityOfFloor(int quantityOfFloor) {
        this.quantityOfFloor = quantityOfFloor;
    }

    @Override
    public String toString() {
        return "HouseType{" +
                "roomStandard='" + roomStandard + '\'' +
                ", quantityOfFloor=" + quantityOfFloor +
                '}';
    }
}
