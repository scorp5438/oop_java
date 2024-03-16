package DZ.DZ_7.model;

public class Calk implements Model {
    protected ComplexNumber x;
    protected ComplexNumber y;

    @Override
    public ComplexNumber res() {
        return new ComplexNumber(0, 0);
    }

    @Override
    public void setNum1() {
    }

    public void setNum1(ComplexNumber complexNumber) {
        this.x = complexNumber;
    }

    @Override
    public void setNum2() {

    }

    public void setNum2(ComplexNumber complexNumber) {
        this.y = complexNumber;
    }

}
