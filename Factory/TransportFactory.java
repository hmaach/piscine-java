
public class TransportFactory {

    public static int getTransport(String type) {
        return switch (type) {
            case "Car" -> new Car().getDistance();
            case "Plane" -> new Plane().getDistance();
            default -> 0;
        };
    }
}
