import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<MailInfo>();


    public void addMailInfo(MailInfo newLetter){
        this.infos.add(newLetter);
    }

    public void sendAll() throws Exception {
        MailSender senderr = new MailSender();
        for (MailInfo oneMail:infos) {
            senderr.sendMail(oneMail);
        }
    }
}
