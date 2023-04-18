package is.hi.bst4.vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

//býr til matseðil.
public class Matsedill {
    protected ObservableList<Veitingar> veitingar;

    public Matsedill() {
        veitingar = FXCollections.observableArrayList();

    }

    public ObservableList<Veitingar> getAllarVeitingar() {
        veitingar.add(new Veitingar("Margarita", 2999));
        veitingar.add(new Veitingar("Pepperoni", 3499));
        veitingar.add(new Veitingar("hawaii", 3499));
        return veitingar;
    }//býr til stök í matseðil lista.

    public ObservableList<Veitingar> getvalnarVeitingar() {
        // veitingar.get(index);
        return veitingar;
    }// skilar öllum veitingum sem eru á lista í formi ObservableList.

    public void setjaGogn(Veitingar matur) {
        veitingar.add(matur);
    }// bætir við veitingu á lista.

    public Veitingar getVeitingar(int index) {
        return veitingar.get(index);
    }//nær í veitingu út frá heiltölu.

    public static void main(String[] args) {
        Matsedill m = new Matsedill();
        m.getAllarVeitingar();
        Matsedill ma = new Matsedill();
        ma.setjaGogn(m.getVeitingar(2));
        System.out.println(ma);
    }//fall sem ég bjó til, til að prófa virkni getVeitingar.
}
