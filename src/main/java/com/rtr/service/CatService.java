package com.rtr.service;

import com.rtr.bean.Cat;
import com.rtr.repository.Cat2Repository;
import com.rtr.repository.CatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by lenovo on 23/11/2019.
 * @transactional 食物绑定
 */
@Service
public class CatService {
    @Resource
    private CatRepository catReposittory;

    @Resource
    private Cat2Repository cat2Repository;

    @Transactional
    public void save(Cat cat) {
        catReposittory.save(cat);
    }

    public void delete(Cat id){
        catReposittory.delete(id);
    }

    public Iterable<Cat> getAll(){
        return catReposittory.findAll();
    }
    public Cat findByCatName(String name) {
        return cat2Repository.findByCatName(name);
    }
    public Cat findByCatName2(String name) {
        return cat2Repository.findMyCatName2(name);
    }
}
