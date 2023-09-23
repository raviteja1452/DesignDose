package command;

public class LoggerJob implements Job {

    private Logger logger;

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void run() {
        if(logger != null) {
           logger.log();
        }
    }
}
