package ceshi.dao;

import ceshi.son;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface Dao {
//    void add(String name,int age);

    son select(String name);
}

