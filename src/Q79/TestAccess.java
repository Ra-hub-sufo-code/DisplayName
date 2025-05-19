package Q79;

public class TestAccess {
    public static void main(String[] args) {
        Employee rau = new Employee("Saushan",20,40000);
        rau.setAge(20);
        System.out.println(rau.getAge());
        rau.setName("Raushan kumar");
        System.out.println(rau.getName());
        System.out.println(rau.displayEmployeeDetails( ));
    }
}
