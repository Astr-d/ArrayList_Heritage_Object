import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("red");
        Car car2 = new Car("blue");
        Car car3 = new Car("yellow");
        Car car4 = new Car("black");
        Car car5 = new Car("purple");
        Car car6 = new Car("green");
        Car car7 = new Car("pink");
        Car car8 = new Car("white");
        Car car9 = new Car("grey");
        Car car10 = new Car ("turquoise");

        ArrayList<Car> carList = new ArrayList<Car>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);

        System.out.println(carList);

    }
}
