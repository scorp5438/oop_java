package DZ.DZ_7.model;

public class Calk implements Model {
    protected double x;
    protected double y;
    protected String op;

    @Override
    public double res() {
        return 0;
    }

    @Override
    public void setNum1(double value) {
        x = value;
    }

    @Override
    public void setNum2(double value) {
        y = value;
    }

}
