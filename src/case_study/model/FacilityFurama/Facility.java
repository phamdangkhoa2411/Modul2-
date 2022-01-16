package case_study.model.FacilityFurama;

public abstract class  Facility {
    private int quantityOfBooking;
    private String serviceName;
    private String codeService;
    private double areaUsable;
    private int rent;
    private int maxPeople;
    private String rentType;

    public Facility() {
    }

    public Facility(int quantityOfBooking, String serviceName, String codeService, double areaUsable, int rent, int maxPeople, String rentType) {
        this.quantityOfBooking = quantityOfBooking;
        this.serviceName = serviceName;
        this.codeService = codeService;
        this.areaUsable = areaUsable;
        this.rent = rent;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    public int getQuantityOfBooking() {
        return quantityOfBooking;
    }

    public void setQuantityOfBooking(int quantityOfBooking) {
        this.quantityOfBooking = quantityOfBooking;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public double getAreaUsable() {
        return areaUsable;
    }

    public void setAreaUsable(double areaUsable) {
        this.areaUsable = areaUsable;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "quantityOfBooking=" + quantityOfBooking +
                ", serviceName='" + serviceName + '\'' +
                ", codeService='" + codeService + '\'' +
                ", areaUsable=" + areaUsable +
                ", rent=" + rent +
                ", maxPeople=" + maxPeople +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
