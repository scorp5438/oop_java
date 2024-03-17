package DZ.DZ_7.controller;

import DZ.DZ_7.model.CalcFactory;
import DZ.DZ_7.model.Calk;
import DZ.DZ_7.model.ComplexNumber;
import DZ.DZ_7.view.View;

public class Controller {
    protected Calk calk;
    protected View view;
    protected ComplexNumber resalt;

    protected CalcFactory cf = new CalcFactory();

    public Controller(Calk c, View v) {
        calk = c;
        view = v;
    }

    public void buttonClick() {

        double[] puzzleComplexNum = view.getValue();
        ComplexNumber cn1 = new ComplexNumber(puzzleComplexNum[0], puzzleComplexNum[1]);
        ComplexNumber cn2 = new ComplexNumber(puzzleComplexNum[2], puzzleComplexNum[3]);
        String op = view.getOperation("Введите операцию +, *, /:");

        calk = cf.createCalc(op);
        calk.setNum1(cn1);
        calk.setNum2(cn2);

        resalt = calk.res();
        view.print(resalt, "Результат: ");
    }

    public ComplexNumber getResalt() {
        return resalt;
    }

}
