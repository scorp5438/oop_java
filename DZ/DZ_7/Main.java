package DZ.DZ_7;

import DZ.DZ_7.controller.NewController;
import DZ.DZ_7.model.Calk;
import DZ.DZ_7.view.View;

public class Main {
    public static void main(String[] args) {
        NewController nc = new NewController(new Calk(), new View());

        nc.buttonClick();

    }
}
