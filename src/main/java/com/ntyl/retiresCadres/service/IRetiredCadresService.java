package com.ntyl.retiresCadres.service;

import com.ntyl.retiresCadres.model.RetiredCadres;

import javax.jws.WebService;

@WebService
public interface IRetiredCadresService {
    public RetiredCadres getModelById(String identityid);

    public int addCadres(RetiredCadres cadres);
}