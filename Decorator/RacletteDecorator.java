
public abstract class RacletteDecorator implements Raclette {

    protected final Raclette decoratedRaclette;

    public RacletteDecorator(Raclette raclette) {
        this.decoratedRaclette = raclette;
    }

    @Override
    public int getCalories() {
        return this.decoratedRaclette.getCalories();
    }

    @Override
    public String getIngredients() {
        return this.decoratedRaclette.getIngredients();
    }

        @Override
    public String toString() {
        return String.format("%s pour %d calories", getIngredients(), getCalories());
    }
}


// RacletteDecorator.java
// public abstract class RacletteDecorator implements Raclette {

//     protected final Raclette decoratedRaclette;

//     public RacletteDecorator(Raclette raclette) {
//         this.decoratedRaclette = raclette;
//     }

//     @Override
//     public int getCalories() {
//         return decoratedRaclette.getCalories();
//     }

//     @Override
//     public String getIngredients() {
//         return decoratedRaclette.getIngredients();
//     }
// }
