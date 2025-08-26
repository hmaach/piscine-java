
class PlaneDriver implements Driver {

    @Override
    public Transport createTransport() {

        return new Plane();
    }
}
