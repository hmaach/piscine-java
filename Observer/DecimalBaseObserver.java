
import java.util.ArrayList;
import java.util.List;

class DecimalBaseObserver implements NumericBaseObserver {

    private final List<String> events;

    public DecimalBaseObserver() {
        this.events = new ArrayList<>();
    }

    @Override
    public void updateState(int state) {
        this.events.add(Integer.toString(state));
    }

    @Override
    public List<String> getEvents() {
        return this.events;
    }
}
