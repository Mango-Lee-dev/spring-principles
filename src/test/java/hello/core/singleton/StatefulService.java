package hello.core.singleton;

public class StatefulService {
    private int price;

    public int order(String name, int price) {
        System.out.println("name = " + name + ", price = " + price);
//        this.price = price; //  여기가 문제가 됨!
        return price;
    }
}
