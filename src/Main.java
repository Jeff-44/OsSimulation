
import Noyau.OS;
import Noyau.Process;
import Noyau.SysInit;
import Noyau.EventGenerator;
import Noyau.Log;


public class Main{
    public static void main(String[] args) {
        String logFilePath = "system_log.txt";
        Log log = new Log(logFilePath);

        // INITIALIZE SYSTEM
        SysInit ops = new SysInit();
        ops.SysInitOps();

        // CREATING INITIAL PROCESS
        OS os = new OS(log);
        os.createProcess("Initial");
        os.runProcessByID(0);

        EventGenerator eventGenerator = new EventGenerator(os, log);
//        Thread eventThread = new Thread(eventGenerator);
//        eventThread.start();

        eventGenerator.start();
        try {
//            eventThread.join();
            eventGenerator.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

