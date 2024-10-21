public class Main {
    public static void main(String[] args) {
        
        Termometro termometro = new Termometro();
        AppTempo appTempo = new AppTempo();
        SiteClima siteClima = new SiteClima();

        termometro.subscribe(appTempo);
        termometro.subscribe(siteClima);
        termometro.setTemperatura(30);
        termometro.setTemperatura(37);
        termometro.setTemperatura(25.5);

        termometro.unsubscribe(appTempo);
        termometro.setTemperatura(40);
        termometro.setTemperatura(32);
    }
    
}
