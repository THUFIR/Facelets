package net.bounceme.doge.facelets;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

@Named
@SessionScoped
public class Contacts implements Serializable {

    private static final long serialVersionUID = 5443351151396868724L;
    private String user = null;

    public Contacts() {
    }

    private void foo() throws NamingException, SQLException {
        Context ctx = new InitialContext();
        DataSource ds = (DataSource) ctx.lookup("jdbc/mysqltest");
        Connection con = ds.getConnection();
    }

}
