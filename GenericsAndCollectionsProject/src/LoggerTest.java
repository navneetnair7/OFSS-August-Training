import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class LoggerTest {
    public static void main(String[] args) {
        PhoneLog log1 = new PhoneLog("Seema", LocalDate.of(2024, 10, 28), "Dialed 911");
        PhoneLog log2 =  new PhoneLog("Tejas", LocalDate.of(2025, 9, 1), "Dialed 100");
        PhoneLog log3 = new PhoneLog("Hamza", LocalDate.of(2025, 9, 2), "Dialed 101");
        PhoneLog log4 = new PhoneLog("Shruti",LocalDate.of(2025, 9, 3), "Dialed sir");

        PhoneLogger phLogger = new PhoneLogger();
        phLogger.saveLog(log1);
        phLogger.saveLog(log2);
        phLogger.saveLog(log3);
        phLogger.saveLog(log4);

        for(int i = 0; i < phLogger.logger.size(); i ++) {
            PhoneLog tempLog = phLogger.logger.get(i);
            System.out.println(tempLog.logMessage + " on " + tempLog.phoneTiming + ", " + tempLog.logType);
        }
    }
}

class PhoneLogger {
    ArrayList<PhoneLog> logger = new ArrayList<PhoneLog>();

    void saveLog(PhoneLog phoneLog) {
        logger.add(phoneLog);
    }

}

class PhoneLog {
    String logMessage;
    LocalDate phoneTiming;
    String logType;

    public PhoneLog(String logMessage, LocalDate phoneTiming, String logType) {
        this.logMessage = logMessage;
        this.phoneTiming = phoneTiming;
        this.logType = logType;
    }

    public String getLogMessage() {
        return logMessage;
    }

    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage;
    }

    public LocalDate getPhoneTiming() {
        return phoneTiming;
    }

    public void setPhoneTiming(LocalDate phoneTiming) {
        this.phoneTiming = phoneTiming;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    @Override
    public String toString() {
        return "PhoneLog{" +
                "logMessage='" + logMessage + '\'' +
                ", phoneTiming=" + phoneTiming +
                ", logType='" + logType + '\'' +
                '}';
    }
}