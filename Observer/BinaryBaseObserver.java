
import java.util.ArrayList;
import java.util.List;

class BinaryBaseObserver implements NumericBaseObserver {

    private final  List<String> events;

    public BinaryBaseObserver() {
        this.events = new ArrayList<>();
    }

    @Override
    public void updateState(int state) {
        this.events.add(Integer.toBinaryString(state));
    }

    @Override
    public List<String> getEvents() {
        return this.events;
    }
}
