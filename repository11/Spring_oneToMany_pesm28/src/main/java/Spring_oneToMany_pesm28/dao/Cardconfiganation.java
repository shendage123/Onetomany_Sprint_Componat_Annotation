package Spring_oneToMany_pesm28.dao;


import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"Spring_oneToMany_pesm28.dto","Spring_oneToMany_pesm28.dao"})
public class Cardconfiganation {
@Bean
public EntityManager getEntityManager() {

	return Persistence.createEntityManagerFactory("rajath").createEntityManager();
}
}
