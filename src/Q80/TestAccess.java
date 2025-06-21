package Q80;

public class TestAccess {
    public static void main(String[] args) {
        DVD obj = new DVD();
        obj.checkOut();
        obj.returnItem();
        obj.returnItem();
        obj.checkOut();
        obj.returnItem();
    }
}
