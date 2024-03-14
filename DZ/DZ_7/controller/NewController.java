package DZ.DZ_7.controller;

import DZ.DZ_7.model.CalcFactory;
import DZ.DZ_7.model.Calk;
import DZ.DZ_7.view.View;

public class NewController {
    Calk calk;
    View view;
    CalcFactory cf = new CalcFactory();

    public NewController(Calk c, View v) {
        calk = c;
        view = v;
    }

    public void buttonClick() {
        double a = view.getValue("Число 1: ");
        double b = view.getValue("Число 2: ");
        String op = view.getOperation("Введите операцию +, *, /: ");

        calk.setNum1(a);
        calk.setNum2(b);

        Calk calculate = cf.createCalc(op);
        double resalt = calculate.res();
        view.print(resalt, "Результат: ");
    }
}
