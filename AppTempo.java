public class AppTempo implements Observer {

    public void update(Observable o) {
        if (o instanceof Termometro) {
            Termometro termometro = (Termometro) o;
            System.out.println("App Tempo: " + termometro.getTemperatura()+ " graus celcius");
        }
    }
    
}
