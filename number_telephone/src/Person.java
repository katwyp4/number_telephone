public class Person extends Post{
    private  String name;
    private String lastname;
    private String address;
     private  NumberTelephone numberTelephone;

    public Person(String name, String lastname, String address, NumberTelephone numberTelephone) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.numberTelephone = numberTelephone;
    }

    @Override
    public void desciption() {
        System.out.println("Person:"+ name + " "+ lastname + ", Adress:" + address + ", Telephone:"+numberTelephone);
    }
}
