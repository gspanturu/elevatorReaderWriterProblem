package sample;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class Passenger implements Observer {
    int howManyLevelsLeft;

    public Passenger() {
        Random rand = new Random();
        this.howManyLevelsLeft = rand.nextInt(10) + 1;
    }

    @Override
    public void update(Observable o, Object arg) {
        howManyLevelsLeft--;
        if(howManyLevelsLeft == 0) {
            o.deleteObserver(this);
        }
    }
}
