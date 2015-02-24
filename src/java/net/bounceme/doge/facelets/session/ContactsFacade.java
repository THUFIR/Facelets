package net.bounceme.doge.facelets.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.bounceme.doge.facelets.ejb.Contacts;

@Stateless
public class ContactsFacade extends AbstractFacade<Contacts> implements ContactsFacadeLocal {
    @PersistenceContext(unitName = "FaceletsPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContactsFacade() {
        super(Contacts.class);
    }
    
}
