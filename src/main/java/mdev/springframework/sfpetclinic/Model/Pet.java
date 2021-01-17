package mdev.springframework.sfpetclinic.Model;

import java.time.LocalDate;

public class Pet {
    private PetType petTypr;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetTypr() {
        return petTypr;
    }

    public void setPetTypr(PetType petTypr) {
        this.petTypr = petTypr;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
