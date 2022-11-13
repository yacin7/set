/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.Collection;

/**
 *
 * @author semah
 */
public class Set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enseignant e1 = new Enseignant(36, "semah", "kadri");
        Enseignant e2 = new Enseignant(14, "med", "arbi");
        Enseignant e3 = new Enseignant(10, "ahmed", "ahmed");

           EspritHashSet hash = new EspritHashSet();
              hash.ajouterEnseignant(e1);
              hash.ajouterEnseignant(e2);
              hash.ajouterEnseignant(e3);
              hash.displayEnseignants();

       System.out.println("***********************");
       
        EspritTreeSet tree = new EspritTreeSet();
        tree.ajouterEnseignant(e1);
        tree.ajouterEnseignant(e2);
        tree.ajouterEnseignant(e3);
        tree.displayEnseignants();
        tree.displayEnseignants();

        System.out.println("PRESENCE PAR ID 10 : " + tree.rechercherEnseignant(10));
        System.out.println("PRESENCE PAR ID 5 : " + tree.rechercherEnseignant(5));


    }

}
