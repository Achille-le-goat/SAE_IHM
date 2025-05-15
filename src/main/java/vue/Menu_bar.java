package vue;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.HBox;

public class Menu_bar extends HBox {
    public Menu_bar() {
        MenuBar menuBar = new MenuBar();
        Menu menuScenario = new Menu("Scenario");
        menuBar.getMenus().add(menuScenario);
    }
}
