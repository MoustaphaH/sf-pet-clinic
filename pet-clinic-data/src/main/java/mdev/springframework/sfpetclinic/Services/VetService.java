package mdev.springframework.sfpetclinic.Services;

import mdev.springframework.sfpetclinic.Model.Owner;
import mdev.springframework.sfpetclinic.Model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Owner> findAll();

}
