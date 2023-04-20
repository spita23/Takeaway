module is.hi.bst4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires junit;

    opens is.hi.bst4.vidmot to javafx.fxml;
    exports is.hi.bst4.vidmot;
    exports is.hi.bst4.vinnsla;
}
