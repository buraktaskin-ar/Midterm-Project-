package vize;



public class Person {
    private String name;
    private ContactInfo contactInformation;

    //Privacy leak durumu dikkate alınır.

    public Person(String name, ContactInfo contactInformation) {
        this.name = name;
        this.contactInformation = new ContactInfo(contactInformation);

    }

    public Person() {
        this.name = null;
        this.contactInformation = null;
    }


    public Person(Person other) {
        this.name = other.name;
        this.contactInformation = new ContactInfo(other.contactInformation);
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactInfo getContactInformation() {
        return new ContactInfo(contactInformation);
    }

    public void setContactInformation(ContactInfo contactInformation) {
        this.contactInformation = new ContactInfo(contactInformation);

}
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", contactInformation=" + getContactInformation() +
                '}';
    }

    public boolean equals(Object obj) {
        // Referans ve sınıf kontrolleri yapılır.
        if (obj == null)
            return false;

        else if ( this.getClass() != obj.getClass()) {
            return false;
        }


        Person p = (Person) obj;
        return (this.getName().equals(p.getName())) &&
                this.getContactInformation().equals(p.getContactInformation());
    }




}
