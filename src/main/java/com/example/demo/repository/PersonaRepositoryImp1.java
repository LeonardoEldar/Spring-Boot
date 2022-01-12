package com.example.demo.repository;

import com.example.demo.DemoApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("persona1")
public class PersonaRepositoryImp1 implements IPersonaRepository {

    Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    @Override
    public void registrar(String nombre) {
        logger.info("PersonaRepositoryImp1");
        logger.info(String.format("Se registro a %s", nombre));
    }
}
