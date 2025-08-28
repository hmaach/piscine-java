
class BaseRaclette implements Raclette {


    @Override
    public int getCalories() {
        return 1000;
    }

    @Override
    public String getIngredients() {
        return "Patate, fromage à raclette";
    }
        @Override
    public String toString() {
        return String.format("%s pour %d calories", getIngredients(), getCalories());
    }
}
