package challenges;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Sending a message to " + user.getName() + " that he bought product.");
    }
}
