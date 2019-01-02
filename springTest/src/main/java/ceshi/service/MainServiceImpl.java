package ceshi.service;

import ceshi.dao.Dao;
import ceshi.son;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {

    private Dao dao;
    @Autowired
    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public son select(String name) {
        return  dao.select(name);
    }
}
