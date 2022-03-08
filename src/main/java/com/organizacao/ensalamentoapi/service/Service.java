package com.organizacao.ensalamentoapi.service;

import com.organizacao.ensalamentoapi.dao.DAOFactory;

public abstract class Service {

    protected ServiceFactory serviceFactory;
    protected DAOFactory daoFactory;

    protected Service() {
        this.serviceFactory = ServiceFactory.getInstance();
        this.daoFactory = DAOFactory.getInstance();
    }
}

