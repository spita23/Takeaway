package is.hi.bst4.vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

//býr til viðskiptavin.
public class Vidskiptavinur {
    public String getNafn() {
        return nafn.get();
    }

    public StringProperty nafnProperty() {
        return nafn;
    }

    public void setNafn(String nafn) {
        this.nafn.set(nafn);
    }

    private StringProperty nafn = new SimpleStringProperty();

    public String getHeimilisfang() {
        return heimilisfang.get();
    }

    public StringProperty heimilisfangProperty() {
        return heimilisfang;
    }

    public void setHeimilisfang(String heimilisfang) {
        this.heimilisfang.set(heimilisfang);
    }

    private StringProperty heimilisfang = new SimpleStringProperty(); //1götuheiti og 2húsnúmer


    public void Vidskiptavinur(String nafn, String heimilisfang) {
        setNafn(nafn);
        setHeimilisfang(heimilisfang);

    }
}
