public class Main {
    public static void main(String[] args) throws Exception {
        Client newone = new Client("Vika", 13, "female", "vika@gmail.com");
        MailInfo newmail = new MailInfo(newone);
        MailBox newbox = new MailBox();
        newbox.addMailInfo(newmail);
        newbox.sendAll();
    }
}
