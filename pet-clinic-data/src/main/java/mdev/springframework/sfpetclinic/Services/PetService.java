package mdev.springframework.sfpetclinic.Services;

import mdev.springframework.sfpetclinic.Model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
