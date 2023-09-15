package Noyau;

public class Process {
    private int pid;
    private String name;

    public Process(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public void execute() {
        if(pid==0){
            System.out.println(name.toUpperCase() + " PROCESS IS RUNNING.");
            System.out.println("LOADING SERVICES AND DRIVERS...");
            System.out.println("INITIALIZING SYSTEM......");
        }else{
            System.out.println("PROCESS " + pid + " (" + name + ") IS RUNNING.");
        }
    }
}
