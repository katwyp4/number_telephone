import java.util.TreeMap;

public class BookTelephone {
    public static void main(String[] args) {

            TreeMap<NumberTelephone, Post> telephoneBook = new TreeMap<>();
            Person person1 = new Person("Anna", "Kowalska", "Kwiatowa", new NumberTelephone("48", "123456789"));
            Person person2 = new Person("Tomasz", "Nowak", "Kwiatowa", new NumberTelephone("48", "123875932"));
            Firm firm1 = new Firm("ABC", "Nowa", new NumberTelephone("48", "146985324"));
            Firm firm2 = new Firm("YZW", "Domowa", new NumberTelephone("48", "667985324"));
            telephoneBook.put(person1.numberTelephone, person1);
            telephoneBook.put(person2.numberTelephone, person2);
            telephoneBook.put(firm1.numberTelephone, firm1);
            telephoneBook.put(firm2.numberTelephone, firm2);
            System.out.println("Book telephone: ");
            for (Post post : telephoneBook.values()) {
                post.description();
            }
        removeDuplicates(telephoneBook);

        System.out.println("Book telephone without duplicate: ");
        for (Post post : telephoneBook.values()) {
            post.description();
        }
    }
    private static void removeDuplicates(TreeMap<NumberTelephone, Post> telephoneBook) {

        TreeMap<String, Post> map = new TreeMap<>();
        for (Post post : telephoneBook.values()) {
            String address = post.getAddress();
            if (!map.containsKey(address)) {
                map.put(address, post);
            }
        }
        telephoneBook.clear();

        for (Post post : map.values()) {
            telephoneBook.put(post.getNumberTelephone(), post);
        }
    }
}
