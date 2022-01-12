package com.example.demo.repository;

import com.example.demo.DemoApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("persona2")
public class PersonaRepositoryImp2 implements IPersonaRepository {

    Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    @Override
    public void registrar(String nombre) {
        logger.info("PersonaRepositoryImp2");
        logger.info(String.format("Se registro a %s", nombre));
    }
}
