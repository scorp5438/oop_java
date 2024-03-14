package DZ.DZ_7.model;

public class CalcFactory {

    public Calk createCalc(String operations) {
        if (operations.equals("+")) {
            return new Sum();
        } else if (operations.equals("/")) {
            return new Division();
        } else if (operations.equals("*")) {
            return new Multiplication();
        } else {
            return new Calk();
        }
    }
}
