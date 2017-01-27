package com.kh.domain;

public class User {
    String FirstName;
    String LastName;
    String Address;
    String City;
    String State;
    String Zip;
    String IsActive;
    
    public String getFirstName() {
        return FirstName;
    }

    // @XmlElement
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    // @XmlElement
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAddress() {
        return Address;
    }

    // @XmlElement
    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    // @XmlElement
    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    // @XmlElement
    public void setState(String State) {
        this.State = State;
    }

    public String getZip() {
        return Zip;
    }

    // @XmlElement
    public void setZip(String Zip) {
        this.Zip = Zip;
    }

    public String getIsActive() {
        return IsActive;
    }

    // @XmlElement
    public void setIsActive(String IsActive) {
        this.IsActive = IsActive;
    }
}
