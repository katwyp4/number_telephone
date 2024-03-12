import java.util.TreeMap;

public class BookTelephone {
    public static void main(String[] args) {
        TreeMap<NumberTelephone,Post> telephoneBook =  new TreeMap<>();
        Person person1 = new Person("Anna", "Kowalska","Kwiatowa_1", new NumberTelephone("48", "123456789"));
        Person person2 = new Person("Tomasz", "Nowak","Biała_15", new NumberTelephone("48", "123875932"));
        Firm firm1 =new Firm("ABC","Nowa_3",new NumberTelephone("48","146985324"));
        Firm firm2 =new Firm("YZW","Domowa_19",new NumberTelephone("48","667985324"));
        telephoneBook.put(person1.numberTelephone,person1);
        telephoneBook.put(person2.numberTelephone,person2);
        telephoneBook.put(firm1.numberTelephone,firm1);
        telephoneBook.put(firm2.numberTelephone,firm2);
    }
}
