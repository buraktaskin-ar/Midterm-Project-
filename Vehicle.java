package vize;



public abstract class Vehicle {

    private String brand;
    private String licencePlate;
    private Person owner;

    public Vehicle() {
        this.brand = null;
        this.licencePlate = null;
        this.owner = null;
    }


    public Vehicle(String brand, String licencePlate, Person owner) {
        this.brand = brand;
        this.licencePlate = licencePlate;
        this.owner = new Person(owner);
    }

    public Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.licencePlate = vehicle.licencePlate;
        this.owner = new Person(vehicle.owner);
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicencePlate() {
        return this.licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public Person getOwner() {
        return new Person(this.owner);
    }

    public void setOwner(Person owner) {
        this.owner = new Person(owner);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", licencePlate='" + licencePlate + '\'' +
                ", owner=" + owner +
                '}';
    }

    public boolean equals(Object obj) {
        // Referans ve sınıf kontrolleri yapılır.
        if (obj == null)
            return false;

        else if ( this.getClass() != obj.getClass()) {
            return false;
        }


        Vehicle v = (Vehicle) obj;
        return (this.getLicencePlate().equals(v.getLicencePlate())) &&
                this.getBrand().equals(v.getBrand())  &&
                this.getOwner().equals(v.getOwner());
    }




    public abstract int calculateTax();






}




















