package mdev.springframework.sfpetclinic.Services;

import mdev.springframework.sfpetclinic.Model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
