
package addressbook2.Base;
import addressbook2.Contact.*;


public class Address {

    String no;
    private String street;
    private String province;
    private String poscalCode;

    public Address(String no, String street, String province, String poscalCode) {
        this.no = no;
        this.street = street;
        this.province = province;
        this.poscalCode = poscalCode;
    }

    public String getNo() {
        return no;
    }

    public String getStreet() {
        return street;
    }

    public String getProvince() {
        return province;
    }

    public String getPoscalCode() {
        return poscalCode;
    }

    @Override
    public String toString() {
        return "Address{" + "no=" + no + ", street=" + street + ", province=" + province + ", poscalCode=" + poscalCode + '}';
    }
    
    
    
    
    

    

    
    
}
