import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MailInfo {
    Client client;
    String mailCode;
    private List<String> messages = Arrays.asList("Birthday", "Invitation", "Advertisement");

    public MailInfo(Client client){
        this.client = client;
        this.mailCode = messages.get(randomNum(0, messages.size()-1));
    }

    private int randomNum(int min, int max){
        Random rn = new Random();
        int range = max - min + 1;
        return rn.nextInt(range) + min;
    }
}
