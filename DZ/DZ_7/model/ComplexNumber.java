package DZ.DZ_7.model;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return imaginary >= 0 ? String.format("(%.1f + %.1fi)", real, imaginary)
                : String.format("(%.1f - %.1fi)", real, (-imaginary));
    }

}
