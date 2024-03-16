public class NumberTelephone implements Comparable<NumberTelephone> {
    private String area_code;
    private String telephone_number;

    public NumberTelephone(String areaCode, String telephoneNumber) {
        area_code = areaCode;
        telephone_number = telephoneNumber;
    }

    public int compareTo(NumberTelephone o) {

        int compareKierunkowy = this.area_code.compareTo(o.area_code);


        if (compareKierunkowy != 0) {
            return compareKierunkowy;
        }


        return this.telephone_number.compareTo(o.telephone_number);
    }

    public String toString() {
        return "+" + area_code + " " + telephone_number;
    }
}
