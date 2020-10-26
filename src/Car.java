public class Car {

    String property;

    public Car(String properties) {
        this.property = properties;
    }

    @Override
    public String toString() {
        return "\n Car --> " +
                "Property: '" + property + '\'' +
                "\n";
    }
}
