package is.hi.bst4.vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

//býr til körfu.
public class Karfa extends Matsedill {
    public IntegerProperty getHeildarverd() {
        return Heildarverd;
    }


    protected ObservableList<Veitingar> karfa;

    public Karfa() {
        karfa = FXCollections.observableArrayList();
    }// geri sér körfu lista.

    public void setHeildarverd(int heildarverd) {
        this.Heildarverd.set(heildarverd);
    }

    IntegerProperty Heildarverd = new SimpleIntegerProperty();

    public IntegerProperty reiknaHeildarverd() {
        //int heildarverd = 0;
        // for (int i = 0; i < veitingar.size(); i++) {
        // heildarverd += veitingar.get(i).getVerd();
        //   Heildarverd.set(Heildarverd.get() + heildarverd);
        // }
        setHeildarverd(0);
        for (Veitingar veiting : veitingar) {
            Heildarverd.set(Heildarverd.get() + veiting.getVerd());
            // System.out.println(veiting.getVerd());
        }
        return Heildarverd;
    }//núllstilli í byrjun svo að verðið sé rétt.
    // læt veitingarnar fara í gegnum for lista sem bætir verði veitingu við heildarverð.

    public ObservableList<Veitingar> baetavidKorfu(Veitingar matur) {
        veitingar.add(matur);
        return veitingar;
    }//mjög svipað getvalnarveitingar úr matseðil en bætir við veitingu á lista og skilar svo veitingum

    public static void main(String[] args) {
        Matsedill m = new Matsedill();
        m.getAllarVeitingar();
        Karfa k = new Karfa();
        k.baetavidKorfu(m.getVeitingar(0));
        k.baetavidKorfu(m.getVeitingar(2));
        System.out.println(k.reiknaHeildarverd());
    }//fall til að prófa reiknaHeildarverd

    public ObservableList<Veitingar> eydaVeitingum() {
        veitingar.removeAll(veitingar);
        setHeildarverd(0);
        return veitingar;
    }//aðferð sem eyðir öllum veitingum úr lista, núllar heildarverð og skilar svo veitingum.
}
