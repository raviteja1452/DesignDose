package command;

import java.util.ArrayList;
import java.util.List;

import solid.ocp.solution.MicrosoftEmailService;

public class Main {

    public static void main(String[] args) {
        TaskRunner worker = new TaskRunner();

        List<Job> jobList = new ArrayList<>();

        EmailJob emailJob = new EmailJob();
        LoggerJob loggerJob = new LoggerJob();
        SMSJob smsJob = new SMSJob();
        FileIOJob fileIOJob = new FileIOJob();

        Email email1 = new Email();
        emailJob.setEmail(email1);
        jobList.add(emailJob);

        Logger logger1 = new Logger();
        loggerJob.setLogger(logger1);
        jobList.add(loggerJob);

        SMS sms1 = new SMS();
        smsJob.setSms(sms1);
        jobList.add(smsJob);

        FileIO fileIO = new FileIO();
        fileIOJob.setFileIO(fileIO);
        jobList.add(fileIOJob);

        for(Job job : jobList) {
            worker.execute(job);
        }

    }
}
