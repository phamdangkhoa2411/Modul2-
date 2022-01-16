package case_study.model.FacilityFurama;

public class VillaType extends Facility {
    private String roomStandard;
    private double poolArea;
    private int quantityOfFloor;
    public VillaType() {
    }

    public VillaType(int quantityOfBooking, String serviceName, String codeService, double areaUsable, int rent, int maxPeople, String rentType, String roomStandard, double poolArea, int quantityOfFloor) {
        super(quantityOfBooking, serviceName, codeService, areaUsable, rent, maxPeople, rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.quantityOfFloor = quantityOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getQuantityOfFloor() {
        return quantityOfFloor;
    }

    public void setQuantityOfFloor(int quantityOfFloor) {
        this.quantityOfFloor = quantityOfFloor;
    }

    @Override
    public String toString() {
        return "VillaType{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", quantityOfFloor=" + quantityOfFloor +
                '}';
    }

}
