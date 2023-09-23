package command;

public class EmailJob implements Job{
    private Email email;

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    public void run() {
        if(email != null) {
            email.sendEmail();
        }
    }
}
