package DZ.DZ_7.model;

public class Division extends Calk {

    @Override
    public ComplexNumber res() {
        double denominator = y.getReal() * y.getReal() + y.getImaginary() * y.getImaginary();

        double resReaal = (x.getReal() * y.getReal() + x.getImaginary() * y.getImaginary()) / denominator;
        double resImaginary = (x.getImaginary() * y.getReal() - x.getReal() * y.getImaginary()) / denominator;
        ComplexNumber resCn = new ComplexNumber(resReaal, resImaginary);
        return resCn;
    }

}
