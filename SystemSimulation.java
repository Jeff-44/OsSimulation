public class SystemSimulation {
    public static void main(String[] args) {
        String logFilePath = "system_log.txt";
        Log log = new Log(logFilePath);

        OS os = new OS(log);
        EventGenerator eventGenerator = new EventGenerator(os, log);
        Thread eventThread = new Thread(eventGenerator);

        eventThread.start();

        try {
            eventThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
