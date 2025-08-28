
public class ConcatStrategy extends OperationStrategy {

    @Override
    public int execute(int a, int b) {
        return Integer.parseInt(Integer.toString(a) + Integer.toString(b));
    }
}
