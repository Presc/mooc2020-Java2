package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {

    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int times) {
        if(times > 0) {
            System.out.println("Application logic is working");
            ui.update();
            execute(times - 1);
        }
    }
}
