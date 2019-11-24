package com.rtr.repository;

import com.rtr.bean.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by lenovo on 23/11/2019.
 */
public interface CatRepository extends CrudRepository<Cat, Integer> {
}
