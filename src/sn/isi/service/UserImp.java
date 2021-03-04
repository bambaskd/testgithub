package sn.isi.service;

import sn.isi.entities.User;

import java.util.Scanner;

public class UserImp implements IUser {
Scanner sc = new Scanner(System.in);
    @Override
    public User saisi() {
        User user= new User();
        System.out.println("donner le nom");
        user.setNom(sc.nextLine());
        System.out.println("donner le prenom");
        user.setPrenom(sc.nextLine());
        System.out.println("donner l'email");
        user.setEmail(sc.nextLine());
        System.out.println("donner le mot de passe");
        user.setPassword(sc.nextLine());
        System.out.println("donner l'etat");
        user.setEtat(Integer.parseInt(sc.nextLine()));
        System.out.println("donner l'identifiant");
        user.setId(Integer.parseInt(sc.nextLine()));

        return user;
    }

    @Override
    public void afficher(User user) {
        System.out.println("le nom est "+ user.getNom());
        System.out.println("le prenom est "+ user.getPrenom());
        System.out.println("l'email est "+ user.getEmail());
        System.out.println("le mot de passe est "+ user.getPassword());
        System.out.println("l'etat est "+ user.getEtat());
        System.out.println("l'identifiant est "+ user.getId());
    }
}
