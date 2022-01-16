package case_study.model.Agreement;

public class Booking  {
    private String bookingId;
    private String startDate;
    private String endDate;
    private String idCustomer;
    private String serviceName;
    private String serviceType = "";
    private String bookingTime;
    private int quantityOfBooking;

    public Booking() {
    }

    public Booking(String bookingId, String startDate, String endDate, String idCustomer,
                   String serviceName, String serviceType, String bookingTime, int quantityOfBooking) {
        this.bookingId = bookingId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
        this.bookingTime = bookingTime;
        this.quantityOfBooking = quantityOfBooking;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public int getQuantityOfBooking() {
        return quantityOfBooking;
    }

    public void setQuantityOfBooking(int quantityOfBooking) {
        this.quantityOfBooking = quantityOfBooking;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", bookingTime='" + bookingTime + '\'' +
                ", quantityOfBooking=" + quantityOfBooking +
                '}';
    }
}
