package com.ntyl.retiresCadres.service.impl;

import com.ntyl.retiresCadres.dao.RetiredCadresDao;
import com.ntyl.retiresCadres.model.RetiredCadres;
import com.ntyl.retiresCadres.service.IRetiredCadresService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RetiredCadresServiceImpl implements IRetiredCadresService {
    @Resource
    private RetiredCadresDao retiredCadresDao;

    @Override
    public RetiredCadres getModelById(String identityid) {
        return retiredCadresDao.getModelById(identityid);
    }


    public int addCadres(RetiredCadres retiredCadres){
        return  retiredCadresDao.addRetiredCadres(retiredCadres);
    }
}