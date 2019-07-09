package com.ntyl.retiresCadres.dao;

import com.ntyl.retiresCadres.model.RetiredCadres;

import java.util.List;

public interface RetiredCadresDao {
    RetiredCadres getModelById(String id);

    int addRetiredCadres(RetiredCadres retiredCadres);

    List<RetiredCadres> getRetiredCadresess();

}
