package Examen;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Clase implementada, pero no usada
 */
public class Log {
    public Logger logger;
    FileHandler fh;

    public Log (String file_name) throws SecurityException, IOException {
        File f = new File(file_name);

        if (!f.exists()) {
            f.createNewFile();
        }

        fh = new FileHandler(file_name, true);
        logger = Logger.getLogger("Logs");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
    }
}
