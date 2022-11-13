/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author semah
 */
public class EspritHashSet implements GestionEnseignant {

    HashSet<Enseignant> enseignants = new HashSet<>();

    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignants.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return this.enseignants.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        Iterator<Enseignant> iterator = this.enseignants.iterator();
        while (iterator.hasNext()) {
            Enseignant e = iterator.next();
            if (e.getId() == id) {
                return true;
            }

        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        this.enseignants.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(this.enseignants);
    }

}
