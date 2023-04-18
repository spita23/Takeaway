package is.hi.bst4.src;

import is.hi.bst4.vinnsla.Matsedill;
import is.hi.bst4.vinnsla.Veitingar;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;

public class MatsedillView extends ListView<Veitingar> {
    public MatsedillView() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("matsedill-view.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        Matsedill mat = new Matsedill();
        mat.getAllarVeitingar();
        setItems(mat.getAllarVeitingar());
    }//hleður inn fxml skránna, setur þennan klasa sem rót og controller bý til matseðil breytu,
    // og set allar veitingar í hann og set það svo sem stökin í listview.

    public static void main(String[] args) {

    }
}
