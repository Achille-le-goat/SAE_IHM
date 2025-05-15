module com.example.sae_ihm_ {
    requires javafx.controls;
    requires javafx.fxml;
    exports vue;
    exports modele;

    requires org.controlsfx.controls;

    opens com.example.sae_ihm_ to javafx.fxml;
    exports com.example.sae_ihm_;

}