package DZ.DZ_7.controller;

import DZ.DZ_7.model.Calk;
import DZ.DZ_7.model.ComplexNumber;
import DZ.DZ_7.model.LogToFile;
import DZ.DZ_7.view.View;

public class ControllerDecorator extends Controller {

    private Controller nc;
    private LogToFile<ComplexNumber> logFile = new LogToFile<ComplexNumber>();

    private ControllerDecorator(Calk c, View v, Controller nc) {
        super(c, v);
        this.nc = nc;
    }

    public ControllerDecorator(Controller nc) {
        this(new Calk(), new View(), nc);
        this.nc = nc;
    }

    public void buttonClick() {
        nc.buttonClick();
        ComplexNumber res = nc.getResalt();
        logFile.log(res);
    }

}
