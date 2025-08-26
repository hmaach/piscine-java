
public class CarDriver implements Driver {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}
