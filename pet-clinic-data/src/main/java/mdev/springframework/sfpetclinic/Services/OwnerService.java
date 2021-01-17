package mdev.springframework.sfpetclinic.Services;

import mdev.springframework.sfpetclinic.Model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Owner save(Owner owner);
    Owner findByLastName(String lastName);
    Set<Owner> findAll();
}
