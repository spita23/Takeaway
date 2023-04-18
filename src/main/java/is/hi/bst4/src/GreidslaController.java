package is.hi.bst4.src;

import is.hi.bst4.vinnsla.Veitingar;
import is.hi.bst4.vinnsla.View;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

//sér um virkni greiðsluviðmóts.
public class GreidslaController {
    @FXML
    public Label fxHeildarverdTexti;
    @FXML
    private Label fxVerd;
    private PontunController pontunController;
    @FXML
    private ListView<Veitingar> greidkarfasedill; // breyta til að sjá veitingar við greiðslu.


    public void initialize() {
        setPontunController((PontunController) ViewSwitcher.lookup(View.PONTUN));
        fxVerd.textProperty().bind(pontunController.karfa.getHeildarverd().asString());
        greidkarfasedill.setItems(pontunController.karfa.getvalnarVeitingar());
        fxHeildarverdTexti.setText("Heildarverð");
    }//næ í pöntuncontroller úr cachinu og næ í heildarverð körfunar þar og birti í greiðsluviðmóti.
    //set stökin sem eru í körfu í pöntuncontroller í greiðslu listann. set svo Heildarverð textann fyrir þægindi notanda.

    public void setPontunController(PontunController pontunController) {
        this.pontunController = pontunController;
    }

    public void fxStadfestaHandler(ActionEvent event) {
        pontunController.karfa.eydaVeitingum();
        ViewSwitcher.switchTo(View.PONTUN);
    }//þurrkar út körfu í pöntuncontroller.
}
