
import java.util.ArrayList;
import java.util.List;

public class ValuePublisher {

    private final List<NumericBaseObserver> observers;

    public ValuePublisher() {
        this.observers = new ArrayList<>();
    }

    public void updateState(int value) {
        for (NumericBaseObserver observer : this.observers) {
            observer.updateState(value);
        }

    }

    public void subscribe(NumericBaseObserver observer) {
        this.observers.add(observer);
    }

    public void unsubscribe(NumericBaseObserver observer) {
        this.observers.remove(observer);
    }
}
