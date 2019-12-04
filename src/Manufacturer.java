public class Manufacturer {
    public Manufacturer(String name, String country, String address, String phone, String fax) {
        this.name = name;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                '}';
    }

    private String name;
    private String country;
    private String address;
    private String phone;
    private String fax;


}
