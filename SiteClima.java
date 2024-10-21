public class SiteClima implements Observer {

    public void update(Observable o) {
        if (o instanceof Termometro) {
            Termometro termometro = (Termometro) o;
            System.out.println("Site Clima: " + termometro.getTemperatura() + " graus celcius");
        }
    }
    
}
