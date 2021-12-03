package cn.pet.mapper;

import cn.pet.pojo.Pet;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cyf
 * @version 1.0
 */

public interface PetMapper {
    int add(Pet p);
    int update(Pet p);
    List<Pet> findAll();
    Pet findByName(@Param("name") String name);
    List<Pet> findByBreed(@Param("breed") int breed);
}
