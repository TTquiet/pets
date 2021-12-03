package cn.pet.service.impl;

import cn.pet.mapper.PetMapper;
import cn.pet.pojo.Pet;
import cn.pet.service.PetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

/**
 * @author cyf
 * @version 1.0
 */
@Service
public class PetServiceImpl implements PetService {
    @Resource
    PetMapper pm;
    @Override
    public String add(Pet p) {
        String msg = "添加失败";
        if(p != null && p.getPetName() != null && p.getPetName() != null){
            Pet petByName = pm.findByName(p.getPetName());
            if(petByName == null){
                msg = "添加成功";
                pm.add(p);
            }
        }
        return msg;
    }

    @Override
    public int update(Pet p) {
        return pm.update(p);
    }

    @Override
    public List<Pet> findAll() {
        return pm.findAll();
    }

    @Override
    public Pet findByName(String name) {
        return pm.findByName(name);
    }

    @Override
    public List<Pet> findByBreed(int breed) {
        return pm.findByBreed(breed);
    }
}
