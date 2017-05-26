/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnaire;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modele.Etudiant;

/**
 *
 * @author deptinfo
 */
@Stateless
public class gestionnaireConnect {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    // Ici injection de code : on n'initialise pas. L'entity manager sera créé  
    // à partir du contenu de persistence.xml  
    @PersistenceContext  
    private EntityManager em;  
    
    public Etudiant creerEtudiant(String nom, String prenom, String email, String pass){
        Etudiant etu = new Etudiant(nom, prenom, email, pass);
        em.persist(etu);
        return etu;
        
    }
}
