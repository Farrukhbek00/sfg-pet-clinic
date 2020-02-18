package com.jafton.sfgpetclinic.services;

import com.jafton.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
