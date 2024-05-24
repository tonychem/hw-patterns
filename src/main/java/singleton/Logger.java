package singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Логгер-одиночка для использования в однопоточной среде с ленивой загрузкой.
 */
public class Logger {
    private static Logger logger;
    private final DateTimeFormatter formatter;

    private Logger() {
        this.formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
    }

    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void classLog(Object obj, String info) {
        System.out.printf("Log info: %s - %s - %s%n", formatter.format(LocalDate.now()), obj, info);
    }
}
