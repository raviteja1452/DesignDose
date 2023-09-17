package singleton;

import java.util.ArrayList;
import java.util.List;

public class GoogleEmailService implements IEmailService {

    private static List<GoogleEmailService> gmailServiceInstances = new ArrayList<>();

    public String emailServiceInstanceName;

    private GoogleEmailService(String emailServiceInstanceName) {
        this.emailServiceInstanceName = emailServiceInstanceName;
    }

    public static GoogleEmailService getEmailService(String emailServiceInstanceName) {
        if(gmailServiceInstances.size() < 3) {
            GoogleEmailService emailInstance = new GoogleEmailService(emailServiceInstanceName);
            gmailServiceInstances.add(emailInstance);
            return emailInstance;
        }
        return gmailServiceInstances.get(0); // logic can change to return instance based on some algorithm
    }

    @Override
    public void sendEmail(String emailId, String emailContent) {
        System.out.println("email instance used :" + emailServiceInstanceName);
    }
}
