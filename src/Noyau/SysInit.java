package Noyau;
import java.util.List;
import java.util.ArrayList;
public class SysInit {
    // OPERATIONS LIST
        private List<String>Operations = new ArrayList<String>();
        public SysInit(){
            Operations.add("--BIOS IS ACTIVATED--");
            Operations.add("POWER ON SELF TEST...");
            Operations.add("LOADING BOOT LOADER...");
            Operations.add("KERNEL INITIALIZATION......");
            Operations.add("");
        }
        // ALLUMAGE

    public void SysInitOps(){
//        System.out.println("--System initialization--");
        try {
            for(String i : Operations){
                System.out.println(i);
                if(i.contains("...")){
                    if(i.contains("......")){
                        Thread.sleep(3000);
                    }
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}



