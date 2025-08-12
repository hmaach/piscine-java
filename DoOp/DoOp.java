
public class DoOp {

    public static String operate(String[] args) {
        if (args.length != 3) {
            return "Error";
        }
        int res;
        int first_op;
        int second_op;

        try {
            first_op = Integer.parseInt(args[0]);
            second_op = Integer.parseInt(args[2]);

            switch (args[1]) {
                case "+" ->
                    res = first_op + second_op;
                case "-" ->
                    res = first_op - second_op;
                case "*" ->
                    res = first_op * second_op;
                case "/" ->
                    res = first_op / second_op;
                case "%" ->
                    res = first_op % second_op;
                default -> {
                    return "Error";
                }
            }

            return String.valueOf(res);
        } catch (Exception e) {
            return "Error";
        }

    }
}
