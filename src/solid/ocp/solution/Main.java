package solid.ocp.solution;



public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        UserService userService = new UserService(new MicrosoftEmailService());

        UserService userService1 = new UserService(new SendGridEmailService());

        UserService userService2 = new UserService(new GoogleEmailService());

    }
}
