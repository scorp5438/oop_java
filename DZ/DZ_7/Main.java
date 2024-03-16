package DZ.DZ_7;

import DZ.DZ_7.controller.Controller;
import DZ.DZ_7.controller.ControllerDecorator;
import DZ.DZ_7.model.Calk;
import DZ.DZ_7.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Calk(), new View());
        ControllerDecorator controllerDecor = new ControllerDecorator(new Controller(new Calk(), new View()));

        // controller.buttonClick();
        controllerDecor.buttonClick();
        controllerDecor.buttonClick();
        controllerDecor.buttonClick();
        controllerDecor.buttonClick();

    }
}
