package vue;

import javafx.scene.layout.VBox;

public class VBoxRoot extends VBox {
    private static Menu_bar chMenuBar;
    private static VboxListeCommande chListeCommande;
    public VBoxRoot() {
        chListeCommande = new VboxListeCommande();
        chMenuBar = new Menu_bar();

        this.getChildren().add(chMenuBar);
        this.getChildren().add(chListeCommande);

    }
}
