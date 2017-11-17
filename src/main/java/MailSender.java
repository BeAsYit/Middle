public class MailSender {

    public void sendMail(MailInfo type) throws Exception {
        if (type.mailCode.equals("Birthday")) {
            System.out.format("Email: %s\n"+
                    "Successfully sent birthday letter to %s, %s %d years old now!\n",
                    type.client.getEmail(),type.client.getName(),type.client.getPronoun(), type.client.getAge());
        }else if (type.mailCode.equals("Advertisement")){
            System.out.format("Email: %s\n"+
                    "Successfully sent advertisement letter to %s with discounts for this %s!\n",
                    type.client.getEmail(), type.client.getName(), type.client.getSex());
        }else if(type.mailCode.equals("Invitation")){
            System.out.format("Email: %s\n"+
                    "Successfully sent invite letter to %s!\n",type.client.getEmail(),type.client.getName());
        }else{
            System.out.format("Email: %s\n"+
                    "Unexpected letter type was given, letter didn't send", type.client.getEmail());
        }
    }
}
