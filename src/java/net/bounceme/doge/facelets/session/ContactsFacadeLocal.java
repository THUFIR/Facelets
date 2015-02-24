package net.bounceme.doge.facelets.session;

import java.util.List;
import javax.ejb.Local;
import net.bounceme.doge.facelets.ejb.Contacts;

@Local
public interface ContactsFacadeLocal {

    void create(Contacts contacts);

    void edit(Contacts contacts);

    void remove(Contacts contacts);

    Contacts find(Object id);

    List<Contacts> findAll();

    List<Contacts> findRange(int[] range);

    int count();
    
}
