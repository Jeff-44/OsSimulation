import java.util.Random;

class EventGenerator implements Runnable {
    private OS os;
    private Random random;
    private Log log;

    public EventGenerator(OS os, Log log) {
        this.os = os;
        this.random = new Random();
        this.log = log;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // Génère des appels système aléatoires (pour cette simulation, nous utilisons 10 événements)
            int eventType = random.nextInt(5); // 0: Lecture, 1: Ecriture, 2: Autre
            os.handleEvent(eventType);

            // Enregistre l'événement dans le journal
            String event = "Evenement " + (i + 1) + ": Type " + eventType;
            log.writeLog(event);

            try {
                Thread.sleep(random.nextInt(1000)); // Délai aléatoire entre les événements
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}