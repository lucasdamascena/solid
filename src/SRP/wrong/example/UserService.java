package SRP.wrong.example;

/**
 * The UserService class is handling both the logic for adding users and sending emails.
 * This violates the Single Responsibility Principle, as the class has more than one responsibility.
 * If there are changes to the email-sending system, the UserService class will also need to be modified, increasing coupling.
 */

public class UserService {

    public void addUser(String name, String email) {
        System.out.println("Usuário " + name + " adicionado ao banco de dados.");

        sendEmail(email);
    }

    private void sendEmail(String email) {
        System.out.println("Enviando e-mail para " + email);
    }
}