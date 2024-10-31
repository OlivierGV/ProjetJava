module com.projetequipe5.projetequipe5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.projetequipe5.projetequipe5 to javafx.fxml;
    exports com.projetequipe5.projetequipe5;
}