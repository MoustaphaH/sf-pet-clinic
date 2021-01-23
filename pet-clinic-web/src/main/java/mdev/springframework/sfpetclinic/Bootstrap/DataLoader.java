package mdev.springframework.sfpetclinic.Bootstrap;

import mdev.springframework.sfpetclinic.Model.Owner;
import mdev.springframework.sfpetclinic.Model.Pet;
import mdev.springframework.sfpetclinic.Model.PetType;
import mdev.springframework.sfpetclinic.Model.Vet;
import mdev.springframework.sfpetclinic.Services.OwnerService;
import mdev.springframework.sfpetclinic.Services.PetTypeService;
import mdev.springframework.sfpetclinic.Services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService){
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);


        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);



        Owner owner1 = new Owner();
        owner1.setFirstName("Mustafa");
        owner1.setLastName("Hassaan");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1235253325");


        Pet MustafasPet = new Pet();
        MustafasPet.setPetType(savedDogPetType);
        MustafasPet.setOwner(owner1);
        MustafasPet.setName("Rosco");
        MustafasPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(MustafasPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Mahmoud");
        owner2.setLastName("Zaki");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("15254022");

        Pet MahmoudsPet = new Pet();
        MahmoudsPet.setName("Just Cat");
        MahmoudsPet.setOwner(owner2);
        MahmoudsPet.setBirthDate(LocalDate.now());
        MahmoudsPet.setPetType(savedCatPetType);
        owner2.getPets().add(MahmoudsPet);

        ownerService.save(owner2);

        System.out.println("Loaded Owners... ");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
