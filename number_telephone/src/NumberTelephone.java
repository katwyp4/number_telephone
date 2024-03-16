public class NumberTelephone implements Comparable<NumberTelephone> {
    private String area_code;
    private String telephone_number;

    public NumberTelephone(String areaCode, String telephoneNumber) {
        area_code = areaCode;
        telephone_number = telephoneNumber;
    }

    public int compareTo(NumberTelephone o) {
        // Porównaj numery kierunkowe
        int compareKierunkowy = this.area_code.compareTo(o.area_code);

        // Jeśli numery kierunkowe są różne, zwróć wynik porównania
        if (compareKierunkowy != 0) {
            return compareKierunkowy;
        }

        // Jeśli numery kierunkowe są równe, porównaj numery telefonów
        return this.telephone_number.compareTo(o.telephone_number);
    }

    // Dodanie metody toString() dla wygodnego wypisywania
    public String toString() {
        return "+" + area_code + " " + telephone_number;
    }
}
