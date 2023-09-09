package solid.ocp.solution;


public class UserService implements IUserService {

    IEmailService emailService;

    public UserService(IEmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void createUserAccount() {
        this.emailService.sendEmail("ravi@email.com", "created account");
        // have definition
    }

    @Override
    public void loginUserAccount() {
        // have definition
    }

    @Override
    public void forgetPassword() {
        // have definition
        this.emailService.sendEmail("ravi@email.com", "forgot password");
    }

    @Override
    public void resetPassword() {
        // have definition
        this.emailService.sendEmail("ravi@email.com", "you successuly reset your password");
    }
}
