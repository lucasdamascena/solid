package SRP.correct.example;

/**
 * Now, the UserService class has only one responsibility: managing users.
 * The responsibility of sending emails has been moved to a new class called EmailService, which has the sole function of handling email sending.
 * This way, if there are changes to the email-sending logic, only the EmailService class will need to be modified, maintaining the Single Responsibility Principle.
 */
public class UserService {
    
    private EmailService emailService;
    
    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void addUser(String name, String email) {
        System.out.println("Usuário " + name + " adicionado ao banco de dados.");

        emailService.sendEmail(email);
    }
}