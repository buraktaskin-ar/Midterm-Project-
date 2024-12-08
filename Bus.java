package vize;

import java.util.Objects;

public class Bus extends Vehicle{
    private int capacity;
    private int ageOfBus;

    public Bus() {
        super();
        this.capacity = 0;
        this.ageOfBus = 0;
    }

    public Bus(String brand, String licencePlate, Person owner, int capacity, int ageOfBus) {
        super(brand, licencePlate, owner);
        this.capacity = capacity;
        this.ageOfBus = ageOfBus;
    }

    public Bus(Bus other) {
        super(other);
        this.capacity = other.capacity;
        this.ageOfBus = other.ageOfBus;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAgeOfBus() {
        return ageOfBus;
    }

    public void setAgeOfBus(int ageOfBus) {
        this.ageOfBus = ageOfBus;
    }




    @Override
    public int calculateTax() {
        int age = this.getAgeOfBus();
        if (age < 5) {
            return 4000;
        } else if (age >= 5 && age <= 10) {
            return 3000;
        } else {
            return 2000;
        }
    }



    public boolean equals(Object obj) {
        // Referans ve sınıf kontrolleri yapılır.
        if (obj == null)
            return false;

        else if ( this.getClass() != obj.getClass()) {
            return false;
        }


        Bus b = (Bus) obj;
        return (this.getBrand().equals(b.getBrand())) &&
                this.getCapacity() == b.getCapacity()  &&
                this.getAgeOfBus() == b.getAgeOfBus()&&
                this.getLicencePlate().equals(b.getLicencePlate())&&
                this.getOwner().equals(b.getOwner());

    }


    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + getBrand() + '\'' +
                ", licencePlate='" + getLicencePlate() + '\'' +
                ", owner=" + getOwner().toString();
    }



}
