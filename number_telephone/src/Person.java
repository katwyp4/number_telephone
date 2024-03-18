public class Person extends Post {
    private String name;
    private String lastname;
    private String address;

    public Person(String name, String lastname, String address, NumberTelephone numberTelephone) {
        super(numberTelephone);
        this.name = name;
        this.lastname = lastname;
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void description() {
        System.out.println("Person:" + name + " " + lastname + ", Adress:" + address + ", Telephone:" + numberTelephone);
    }
}
