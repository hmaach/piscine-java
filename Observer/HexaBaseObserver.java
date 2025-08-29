
import java.util.ArrayList;
import java.util.List;

public class HexaBaseObserver implements NumericBaseObserver {

    private final List<String> events;

    public HexaBaseObserver() {
        this.events = new ArrayList<>();
    }

    @Override
    public void updateState(int state) {
        this.events.add(Integer.toHexString(state));
    }

    @Override
    public List<String> getEvents() {
        return this.events;
    }
}
