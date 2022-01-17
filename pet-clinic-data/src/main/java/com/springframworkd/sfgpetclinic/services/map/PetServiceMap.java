package com.springframworkd.sfgpetclinic.services.map;

import com.springframworkd.sfgpetclinic.model.Pet;
import com.springframworkd.sfgpetclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {


    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),  object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

}
