package app.adress;

import app.entities.Houses;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Stateless
public class AdressBean {
    @PersistenceContext(unitName = "persUnit")
    private EntityManager em;

    public Collection<Houses> findAll(){
        return em.createQuery("SELECT h FROM Houses h", Houses.class).getResultList();
    }
}
