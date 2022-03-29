package co.za.mycput.Entity;
/*
    Author: Tshimanga Marco (219049505)

 */
public class Doctor {
    private String drFirstName;
    private String drLastName;
    private String drGender;
    private String drAddress;
    private int drIdNumber;
    private long drPhoneNumber;

    public Doctor(Builder builder) {
        this.drFirstName = builder.drFirstName;
        this.drLastName = builder.drLastName;
        this.drGender = builder.drGender;
        this.drAddress = builder.drAddress;
        this.drIdNumber = builder.drIdNumber;
        this.drPhoneNumber = builder.drPhoneNumber;
    }


    public String getDrFirstName() {
        return drFirstName;
    }

    public void setDrFirstName(String drFirstName) {
        this.drFirstName = drFirstName;
    }

    public String getDrLastName() {
        return drLastName;
    }

    public void setDrLastName(String drLastName) {
        this.drLastName = drLastName;
    }

    public String getDrGender() {
        return drGender;
    }

    public void setDrGender(String drGender) {
        this.drGender = drGender;
    }

    public String getDrAddress() {
        return drAddress;
    }

    public void setDrAddress(String drAddress) {
        this.drAddress = drAddress;
    }

    public int getDrIdNumber() {
        return drIdNumber;
    }

    public void setDrIdNumber(int drIdNumber) {
        this.drIdNumber = drIdNumber;
    }

    public long getDrPhoneNumber() {
        return drPhoneNumber;
    }

    public void setDrPhoneNumber(long drPhoneNumber) {
        this.drPhoneNumber = drPhoneNumber;
    }
    public static class Builder {
        private String drFirstName;
        private String drLastName;
        private String drGender;
        private String drAddress;
        private int drIdNumber;
        private long drPhoneNumber;


        public Builder setDrFirstName(String drFirstName) {
            this.drFirstName = drFirstName;
            return this;
        }

        public Builder setSubjectId(String drLastName) {
            this.drLastName = drLastName;
            return this;
        }

        public Builder setDrGender(String drGender) {
            this.drGender = drGender;
            return this;
        }

        public Builder setDrAddress( String drAddress) {
            this.drAddress = drAddress;
            return this;
        }
        public Builder setDrIdNumber( int drIdNumber) {
            this.drIdNumber = drIdNumber;
            return this;
        }
        public Builder setDrPhoneNumber( long drPhoneNumber) {
            this.drPhoneNumber = drPhoneNumber;
            return this;
        }
        public Builder copy(Doctor doctor){
            this.drFirstName = doctor.drFirstName;
            this.drLastName = doctor.drLastName;
            this.drGender = doctor.drGender;
            this.drAddress = doctor.drAddress;
            this.drPhoneNumber = doctor.drPhoneNumber;
            this.drIdNumber = doctor.drIdNumber;

            return this;
        }
        public Doctor build(){
            return new Doctor(this);
        }
    }
}
