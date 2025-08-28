
class HouseBuilder implements HousingBuilder {

    private final House house;

    public HouseBuilder() {
        this.house = new House();
    }

    @Override
    public HousingBuilder setSize(int size) {
        this.house.setSize(size);
        return this;
    }

    @Override
    public HousingBuilder setPrice(int price) {
        this.house.setPrice(price);
        return this;
    }

    @Override
    public HousingBuilder setRooms(int rooms) {
        this.house.setRooms(rooms);
        return this;
    }

    @Override
    public HousingBuilder setName(String name) {
        this.house.setName(name);
        return this;
    }

    @Override
    public Housing build() {
        return this.house;
    }
}
