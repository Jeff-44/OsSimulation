package Noyau;

import java.util.ArrayList;
import java.util.List;

public class OS {
    private Log log;
    private List<Process> processes;

    public OS(Log log) {
        this.log = log;
        processes =  new ArrayList<Process>();
    }
    public void createProcess(String name) {
        int pid = processes.size();
        Process process = new Process(pid, name);
        processes.add(process);

//        return processes.get(pid);
    }

    public void runProcesses() {
        for (Process process : processes) {
            process.execute();
        }
    }

    public void runProcessByID(int id){
        processes.get(id).execute();
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






