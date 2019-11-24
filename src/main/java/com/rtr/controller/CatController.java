package com.rtr.controller;

import com.rtr.bean.Cat;
import com.rtr.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Iterator;

/**
 * Created by lenovo on 23/11/2019.
 */
@RestController
@RequestMapping("/cat")
public class CatController {
    @Resource
    private CatService catService;
    @RequestMapping("/save")
    public String save(){
        Cat cat = new Cat();
        cat.setCatName("nan");
        catService.save(cat);
        return "save ok.";

    }

    @RequestMapping("/delete")
    public String delete(){
        Cat cat = new Cat();
        catService.delete(cat);
        return "delete ok.";
    }

    @RequestMapping("/getAll")
    public Iterable<Cat>  getAll() {
        return catService.getAll();
    }

    @RequestMapping("/findByCatName")
    public Cat  findByCatName(String catName) {
        return catService.findByCatName(catName);
    }

    @RequestMapping("/findByCatName2")
    public Cat  findByCatName2(String catName) {
        return catService.findByCatName2(catName);
    }
}
