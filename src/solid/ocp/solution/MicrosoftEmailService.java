package solid.ocp.solution;

public class MicrosoftEmailService implements IEmailService {
    @Override
    public boolean sendEmail(final String emailId, final String message) {
        return false; //microsoftSDK.sendMicroEmail();
    }
}
