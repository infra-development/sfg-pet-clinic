package com.springframworkd.sfgpetclinic.services;

import com.springframworkd.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    //Owner Service Done
    Owner findByLastName(String name);
}
