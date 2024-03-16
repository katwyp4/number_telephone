public class Firm extends Post {
    private String name;
    private String address;

    public Firm(String name, String address, NumberTelephone numberTelephone) {
        super(numberTelephone);
        this.name = name;
        this.address = address;
    }

    @Override
    public void description() {
        System.out.println("Firm:"+ name + " " + ", Adress:" + address + ", Telephone:"+numberTelephone);
    }
    @Override
    public String getAddress() {
        return address;
    }

    public  int compareTo(Firm o){

        return this.name.compareTo(o.name);
    }
}
