package net.bounceme.doge.facelets;

import java.io.Serializable;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class User implements Serializable {

    private static final long serialVersionUID = 5443351151396868724L;
    private String user = null;
    private String response = null;
    private List<String> users = new ArrayList<>();
    private String cn = User.class.getCanonicalName();
    private String myName = "thufir";
    private String myId = "fdjkl532434";

    public User() {
        out.println(cn);
        users.add("bart");
        users.add("homer");
    }

    public void setUser(String user) {
        out.println(cn + "\tsetUser..\t" + user);
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public String getResponse() {
        if (true) {
            return "yes";
        } else {
            return "no";
        }
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyId() {
        return myId;
    }

    public void setMyId(String myId) {
        this.myId = myId;
    }
}
