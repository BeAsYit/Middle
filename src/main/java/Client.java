public class Client {
    private String name;
    private int age;
    private String sex;
    private String email;
    private String pronoun;

    public Client(String name, int age, String sex, String email){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
        if(sex.equals("male")){
            this.pronoun = "he";
        }else{this.pronoun = "she";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String otherInformation) {
        this.email= otherInformation;
    }


    public String getPronoun() {
        return pronoun;
    }

    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }
}
