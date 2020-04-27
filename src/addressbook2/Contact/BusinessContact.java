package addressbook2.Contact;

import addressbook2.Base.*;

public class BusinessContact extends Contact implements Comparable<BusinessContact> {

    private Company company;
    private String jobtitle;

    public BusinessContact(Company company, String jobtitle, Address address, String email, String phone, Contactype type) {
        super(address, email, phone, type);
        this.company = company;
        this.jobtitle = jobtitle;
    }

    public Company getCompany() {
        return company;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    @Override
    public int compareTo(BusinessContact o) {
        return company.getName().compareTo(o.company.getName());
    }

    @Override
    public String toString() {
        return "BusinessContact{" + "company=" + company + ", jobtitle=" + jobtitle + '}';
    }

    
    
}
