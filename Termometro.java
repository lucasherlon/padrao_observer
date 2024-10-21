import java.util.ArrayList;
import java.util.List;

public class Termometro  implements Observable {
    private List<Observer> observers = new ArrayList<Observer>();
    private double temperatura;
 
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notifyObserver();
    }

    public double getTemperatura() {
        return temperatura;
    }
    
    public void subscribe(Observer o) {
        observers.add(o);
    }
    
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }
    
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(this);
        }
    }
    
   

}
