package cn.pet.controller;

import cn.pet.pojo.Pet;
import cn.pet.service.PetService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author cyf
 * @version 1.0
 */
@Controller

public class PetServlet {
    @Resource
    private PetService ps;
    @RequestMapping("/find")
    public String fingAll(Model model){
        List<Pet> plist = ps.findAll();
        System.out.println("findAll");
        for (Pet pet : plist) {
            System.out.println(pet);
        }
        model.addAttribute("plist",plist);
       return "main";
    }

    @RequestMapping("hh")
    @ResponseBody
    public String hh(){
        return "hhhhhh";
    }
}
