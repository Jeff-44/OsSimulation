package Noyau;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    private String logFilePath;

    public Log(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    public synchronized void writeLog(String event) {
        try {
//            PrintWriter writer = new PrintWriter(new FileWriter(logFilePath, true));
            PrintWriter writer = new PrintWriter(new FileWriter(logFilePath, true));
            String timestamp = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS").format(new Date());
            writer.println(timestamp + " - " + event);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

