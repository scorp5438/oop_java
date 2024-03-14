package DZ.DZ_7.view;

import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);

    public double getValue(String text) {
        System.out.printf("%s ", text);
        return sc.nextDouble();
    }

    public String getOperation(String text) {
        System.out.printf("%s ", text);
        return sc.next();
    }

    public void print(double data, String title) {
        System.out.printf("%s: %f\n", title, data);
    }
}
