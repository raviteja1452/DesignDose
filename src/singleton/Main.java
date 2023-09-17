package singleton;

public class Main {
    public static void main(String[] args) {
        GoogleEmailService gmailService1 = GoogleEmailService.getEmailService("instance 1");
        GoogleEmailService gmailService2 = GoogleEmailService.getEmailService("instance 2");
        GoogleEmailService gmailService3 = GoogleEmailService.getEmailService("instance 3");
        GoogleEmailService gmailService4 = GoogleEmailService.getEmailService("instance 4");
        GoogleEmailService gmailService5 = GoogleEmailService.getEmailService("instance 5");

        gmailService1.sendEmail("ravi", "test");
        gmailService2.sendEmail("ravi", "test");
        gmailService3.sendEmail("ravi", "test");
        gmailService4.sendEmail("ravi", "test");
        gmailService5.sendEmail("ravi", "test");
    }
}
