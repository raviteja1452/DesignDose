package solid.ocp.solution;

public class SendGridEmailService implements  IEmailService {

    // dependant libraries to connect to send grid servers.

    public boolean sendEmail(String emailId, String message) {
        // using send grid it will send it to the respective user email.
        return true;
    }

    public boolean sendEmailUsingGoogle(String emailId, String message) {
        // using send grid it will send it to the respective user email.
        return true;
    }


}
