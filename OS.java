public class OS {
    private Log log;

    public OS(Log log) {
        this.log = log;
    }

    public void handleEvent(int eventType) {
        // Traiter les différents appels système en fonction de leur type
        switch (eventType) {
            case 0:
                System.out.println("Lecture demandée");
                log.writeLog("Lecture demandée");
                break;
            case 1:
                System.out.println("Ecriture demandée");
                log.writeLog("Ecriture demandée");
                break;
            case 2:
                System.out.println("Autre événement");
                log.writeLog("Autre événement");
                break;
            case 3:
                System.out.println("Autre événement aleatoire");
                log.writeLog("Autre événement aleatoire");
                break;
        }
    }
}

