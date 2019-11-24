package com.rtr.repository;

import com.rtr.bean.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

/**
 * Created by lenovo on 23/11/2019.
 * first letter cap
 * get|find|read to begin with
 */
public interface Cat2Repository extends Repository<Cat, Integer> {
    public Cat findByCatName(String catName);

    @Query("from Cat where catName=:cn")
    public Cat findMyCatName2(@Param("cn")String catName);
}
