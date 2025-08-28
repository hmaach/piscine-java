
class ApartmentBuilder implements HousingBuilder {

    private final Apartment apartment;

    public ApartmentBuilder() {
        this.apartment = new Apartment();
    }

    @Override
    public HousingBuilder setSize(int size) {
        this.apartment.setSize(size);
        return this;
    }

    @Override
    public HousingBuilder setPrice(int price) {
        this.apartment.setPrice(price);
        return this;
    }

    @Override
    public HousingBuilder setRooms(int rooms) {
        this.apartment.setRooms(rooms);
        return this;
    }

    @Override
    public HousingBuilder setName(String name) {
        this.apartment.setName(name);
        return this;
    }

    @Override
    public Housing build() {
        return this.apartment;
    }
}
