package Noyau;

import java.io.*;
import java.lang.Process;  // BUILT-IN PROCESS
import java.util.Scanner;
//import UserSpace.User;
//--------------------------------------- USER CLASS
//import java.util.Scanner;
class User {
    public static void main(String [] args){
        String again = "yes";
        System.out.println("(USER SPACE)");
        System.out.println("=====WELCOME TO SOFAMORE OPERATING SYSTEM=====");
        System.out.println("     PRESS ANY KEY TO ACCESS OUR SERVICES");
        Scanner scanner = new Scanner(System.in);

        while (again == "yes" && scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println("Java program received: " + input);
            System.out.println("WANT TO CONTINUE ?(yes/no)");
            again = scanner.nextLine();
        }

    }
}
//-------------------------------------------------
public class HandleUserApp {



        public static void main(String[] args) {
            try {
                // Replace "YourJarFile.jar" with the actual name of your .jar file
                String jarFilePath = "YourJarFile.jar";

                // Create a ProcessBuilder to run the .jar file
                ProcessBuilder pb = new ProcessBuilder("java", "-jar", jarFilePath);

                // Redirect output to the console
                pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
                pb.redirectError(ProcessBuilder.Redirect.INHERIT);

                // Start the process
                Process process = pb.start();

                // Optionally, wait for the process to complete
                int exitCode = process.waitFor();
                System.out.println("The launched application exited with code: " + exitCode);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }






