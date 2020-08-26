/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;

/**
 *
 * @author 
 */
public class HeadQuater extends Observable {
    private int someData;

    public void setSomeData(int aData) {
	someData = aData;
        setChanged();
	notifyObservers("From HeadQuater");
    }
    public int getSomeData() {
	return someData;
    }
}
