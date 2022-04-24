package firstLayeredApp.core;

import firstLayeredApp.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{
    @Override
    public void logToSystem(String message) {
        JLoggerManager manager = new JLoggerManager();
        manager.log(message);
        /*yazılan kod sayesinde dış servislerin JLogger'ını kullanmış oluruz
        * dış ortamdan bir veriyi kendi verilerimize entegre etmiş oluruz.*/


    }
}
