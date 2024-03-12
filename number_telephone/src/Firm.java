public class Firm extends Post{
    private String name;
    private  String address;
      public NumberTelephone numberTelephone;

    public Firm(String name, String address, NumberTelephone numberTelephone) {
        this.name = name;
        this.address = address;
        this.numberTelephone = numberTelephone;
    }


    @Override
    public void desciption() {
        System.out.println("Person:"+ name + " " + ", Adress:" + address + ", Telephone:"+numberTelephone);
    }
}
