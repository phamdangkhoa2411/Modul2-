package ss15_debug_and_exception.bai_tap;

public class ExceptionRectangle extends Exception {
    public  ExceptionRectangle (){
        System.out.println("tam giac khong hop le");
    }

    public ExceptionRectangle(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
