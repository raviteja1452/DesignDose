package solid.ocp.problem;

import solid.isp.solution.IUserService;

public class UserService implements IUserService {

    @Override
    public void createUserAccount() {
        SendGridEmailService emailService = new SendGridEmailService();
        emailService.sendEmail("ravi@email.com", "created account");
        // have definition
    }

    @Override
    public void loginUserAccount() {
        // have definition
    }

    @Override
    public void forgetPassword() {
        // have definition
        SendGridEmailService emailService = new SendGridEmailService();
        emailService.sendEmail("ravi@email.com", "forgot password");
    }

    @Override
    public void resetPassword() {
        // have definition
        SendGridEmailService emailService = new SendGridEmailService();
        emailService.sendEmail("ravi@email.com", "you successuly reset your password");
    }
}
