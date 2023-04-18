module is.hi.bst4.takeaway {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens is.hi.bst4.src to javafx.fxml;
    exports is.hi.bst4.src;
}
