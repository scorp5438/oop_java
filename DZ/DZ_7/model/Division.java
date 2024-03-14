package DZ.DZ_7.model;

public class Division extends Calk {

    @Override
    public double res() {
        if (x != 0) {
            return x / y;
        } else {
            System.out.println("Ты дебил.");
            return 0;
        }
    }

}
