package com.jafton.sfgpetclinic.repositories;

import com.jafton.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
