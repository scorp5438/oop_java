package DZ.DZ_7.view;

import java.util.Scanner;

import DZ.DZ_7.model.ComplexNumber;

public class View {
    Scanner sc = new Scanner(System.in);
    private double[] puzzleComplexNum = new double[4];

    public double[] getValue() {
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                System.out.printf("Введите real: ");
            } else {
                System.out.printf("Введите imaginary: ");
            }
            puzzleComplexNum[i] = sc.nextDouble();
        }
        return puzzleComplexNum;
    }

    public String getOperation(String text) {
        System.out.printf("%s ", text);
        return sc.next();
    }

    public void print(ComplexNumber data, String title) {
        System.out.printf("%s%s\n", title, data);
    }
}