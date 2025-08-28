
public class WithColdMeats extends RacletteDecorator {

    public WithColdMeats(Raclette raclette) {
        super(raclette);
    }

    @Override
    public int getCalories() {
        return this.decoratedRaclette.getCalories() + 350;
    }

    @Override
    public String getIngredients() {
        return this.decoratedRaclette.getIngredients() + ", charcuterie";
    }

    @Override
    public String toString() {
        return String.format("%s pour %d calories", getIngredients(), getCalories());
    }
}
