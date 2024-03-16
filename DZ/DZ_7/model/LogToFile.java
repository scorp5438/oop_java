package DZ.DZ_7.model;

import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class LogToFile<T> implements Logging {

    private static Logger log = Logger.getLogger("My log");
    private String file = "C:\\Users\\Punisher\\Desktop\\Class\\oop_java\\DZ\\DZ_7\\log\\log.txt";

    @Override
    public void log() {
    }

    public void log(T data) {
        try {
            FileHandler fh = new FileHandler(file, true);
            fh.setFormatter(new SimpleFormatter());
            log.addHandler(fh);
            log.setUseParentHandlers(false);
            log.info("result:" + data.toString());
            fh.close();
        } catch (Exception e) {
            System.out.println("Ошибка записи в файл...");
        }
    }

}
