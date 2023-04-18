package is.hi.bst4.src;

import is.hi.bst4.vinnsla.Karfa;
import is.hi.bst4.vinnsla.Matsedill;
import is.hi.bst4.vinnsla.Veitingar;
import is.hi.bst4.vinnsla.View;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

//sér um virkni pöntunarviðmóts.
public class PontunController {
    @FXML
    private MatsedillView mat; //býr til eintak af matseðilklasanum sem gerir matseðil listann.
    private int virkurIndex = 0; //heiltölubreytan úr músasmelli
    public Karfa karfa = new Karfa();
    private Matsedill matsedill = new Matsedill();//bý til matsedil breytu til að ná í veitingar úr.
    @FXML
    private Label fxUttak; //Heildarverð
    @FXML
    private ListView<Veitingar> karfasedill;//þetta er breytan fyrir körfu Listview í pöntunarviðmótinu


    @FXML
    public void fxSetjaKorfuHandler(ActionEvent event) {
        Veitingar val = matsedill.getVeitingar(virkurIndex);
        karfa.setjaGogn(val);
        karfasedill.setItems(karfa.getvalnarVeitingar());
        karfa.reiknaHeildarverd();
    } //býr til veitingabreytu og fær gildið með því að setja inn gildi músasmelli í getVeitingar.
    //setjum svo þá veitingu í körfu. Setjum svo það stak í karfasedil og reiknum svo heildarverðið.

    @FXML
    public void fxTakaUrKorfuHandler(ActionEvent event) {
        karfasedill.getSelectionModel().getSelectedItems().forEach((selected) -> {
            karfasedill.getItems().remove(selected);
        });
        karfa.reiknaHeildarverd();
    } //finnur hvaða stak í lista er valið og eyðir því út og reiknar svo heildarverðið

    public void fxInnskraningHandler(ActionEvent event) {
        ViewSwitcher.switchTo(View.LOGIN);
    }//skiptir um viðmótsglugga

    public void fxGreidaHandler(ActionEvent event) {
        ViewSwitcher.switchTo(View.GREIDSLA);
    }//skiptir um viðmótsglugga

    public void initialize() {
        //  Karfa k = new Karfa();

        mat.setItems(matsedill.getAllarVeitingar());

        mat.getSelectionModel().selectedItemProperty().addListener((observable, oldvalue, newvalue) -> {
            virkurIndex = mat.getSelectionModel().getSelectedIndex();
        });
        fxUttak.textProperty().bind(karfa.getHeildarverd().asString());
    } //set veitingar í Matsedillview stakið, bý til virkurIndex með því að binda það við valið stak í listview.
    //tengi fxUttak(heildarverð breytan) við heildarverð körfu og skila sem streng.
}
