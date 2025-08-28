public class Context {
    private OperationStrategy operationStrategy;

    public Context() {
        this.operationStrategy = new AddStrategy();
    }

    public void changeStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int execute(int a, int b) {
        return operationStrategy.execute(a, b);
    }
}