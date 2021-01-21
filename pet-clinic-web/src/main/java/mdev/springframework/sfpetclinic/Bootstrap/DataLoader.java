package mdev.springframework.sfpetclinic.Bootstrap;

import mdev.springframework.sfpetclinic.Model.Owner;
import mdev.springframework.sfpetclinic.Model.Vet;
import mdev.springframework.sfpetclinic.Services.OwnerService;
import mdev.springframework.sfpetclinic.Services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Mustafa");
        owner1.setLastName("Hassaan");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setLastName("Mahmoud");
        owner2.setLastName("Zaki");

        ownerService.save(owner2);

        System.out.println("Loaded Owners... ");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        System.out.println("Loaded Vets...");

    }
}
