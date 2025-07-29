package Revision;

public interface First {
    void fun();
}

class Main {
    public static void main(String[] args) {
        First obj = new First() {
            public void fun() {
                System.out.println("Anonymous fun");
            }
        };
        obj.fun();
    }
}
