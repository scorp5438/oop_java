package DZ.DZ_7.model;

public class Sum extends Calk {

    @Override
    public ComplexNumber res() {
        double resReaal = x.getReal() + y.getReal();
        double resImaginary = x.getImaginary() + y.getImaginary();
        ComplexNumber resCn = new ComplexNumber(resReaal, resImaginary);
        return resCn;
    }

}
