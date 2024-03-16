package DZ.DZ_7.model;

public class Multiplication extends Calk {

    @Override
    public ComplexNumber res() {
        double resReaal = (x.getReal() * y.getReal()) - (x.getImaginary() * y.getImaginary());
        double resImaginary = (x.getReal() * y.getImaginary()) + (y.getReal() * x.getImaginary());
        ComplexNumber resCn = new ComplexNumber(resReaal, resImaginary);
        return resCn;
    }

}
