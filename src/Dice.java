import javax.swing.*;import java.util.ArrayList;import java.util.Observable;// class Dice is Subjectpublic class Dice extends Observable implements DiceInterface {    private int value = 1;    boolean holdStatus = false;    private ArrayList<Dice> myDice = new ArrayList<>();    @Override    public void roll() {                double randomNumber = (System.nanoTime() % 6) + 1;                value = (int)randomNumber;                setChanged();                notifyObservers();    }    @Override    public int getValue() {        return value;    }    public boolean isHold() {    //  what is the diff between 1) boolean hold 2) method boolean isHold() => 1) is variable whereas 2) is method        return holdStatus;      // now always retuen 'false'    }    public String toString(){        return "" + getValue();    }    private int icon;    public void setIcon(int icon){        this.icon = icon;    }    public int getIcon(){        return icon;    }}