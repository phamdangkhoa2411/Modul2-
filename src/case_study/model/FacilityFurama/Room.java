package case_study.model.FacilityFurama;

public class Room extends Facility  {
    private String freeService;

    public Room() {
    }

    public Room(int quantityOfBooking, String serviceName, String codeService, double areaUsable, int rent, int maxPeople, String rentType , String freeService) {
        super(quantityOfBooking,serviceName,codeService,areaUsable,rent,maxPeople,rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
