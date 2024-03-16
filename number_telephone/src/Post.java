public abstract class Post {
    protected NumberTelephone numberTelephone;

    public Post(NumberTelephone numberTelephone) {
        this.numberTelephone = numberTelephone;
    }

    public abstract void description();
    public abstract String getAddress();

    // Getter dla numeru telefonu
    public NumberTelephone getNumberTelephone() {
        return numberTelephone;
    }
}
