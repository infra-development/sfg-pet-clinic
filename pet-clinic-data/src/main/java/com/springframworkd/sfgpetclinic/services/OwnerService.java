package com.springframworkd.sfgpetclinic.services;

import com.springframworkd.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    //Owner Service
    Owner findByName(String name);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
