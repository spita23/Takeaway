package is.hi.bst4.vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

//býr til veitingar.
public class Veitingar {
    private StringProperty heiti = new SimpleStringProperty();

    public int getVerd() {
        return Integer.parseInt(verd.get());
    }


    public StringProperty verdProperty() {
        return verd;
    }

    private StringProperty verd = new SimpleStringProperty();

    public Veitingar(String heiti, int verd) {
        setHeiti(heiti);
        setVerd(verd);
    }

    public void setVerd(int verd) {
        this.verd.set(Integer.toString(verd));
    }

    public String getHeiti() {
        return heiti.get();
    }

    public StringProperty heitiProperty() {
        return heiti;
    }

    @Override
    public String toString() {
        return getHeiti() + " " + getVerd();
    }


    public void setHeiti(String heiti) {
        this.heiti.set(heiti);
    }

}
