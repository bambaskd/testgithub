package main;

import sn.isi.entities.User;
import sn.isi.service.IUser;
import sn.isi.service.UserImp;

public class Main {
    public static void main(String[] args) {
        IUser u= new UserImp();
        User us= u.saisi();
        u.afficher(us);
    }
}
