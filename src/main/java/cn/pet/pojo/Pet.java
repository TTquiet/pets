package cn.pet.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author cyf
 * @version 1.0
 */
public class Pet {
    private Integer petId;//int(11) NOT NULL
    private String petName;//varchar(50) NULL
    private Integer petBreed;//int(11) NOT NULL
    private Integer petSex;//int(11) NOT NULL
    private String description;//varchar(200) NULL
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;//datetime NOT NULL

    public Pet() {
    }

    public Pet(Integer petId, String petName, Integer petBreed, Integer petSex, String description, Date birthday) {
        this.petId = petId;
        this.petName = petName;
        this.petBreed = petBreed;
        this.petSex = petSex;
        this.description = description;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petId=" + petId +
                ", petName='" + petName + '\'' +
                ", petBreed=" + petBreed +
                ", petSex=" + petSex +
                ", description='" + description + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Integer getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(Integer petBreed) {
        this.petBreed = petBreed;
    }

    public Integer getPetSex() {
        return petSex;
    }

    public void setPetSex(Integer petSex) {
        this.petSex = petSex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
