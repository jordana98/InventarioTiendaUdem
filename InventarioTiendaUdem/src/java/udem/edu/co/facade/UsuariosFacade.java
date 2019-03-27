/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.facade;

<<<<<<< HEAD
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
=======
import java.util.List;
import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
>>>>>>> d62c4ae19cdfaff10d5664dd4e7e992b8a37facc
import udem.edu.co.entity.Usuarios;

/**
 *
<<<<<<< HEAD
 * @author Jordana Apolinario
 */
@Stateless
public class UsuariosFacade extends AbstractFacade<Usuarios> {
    @PersistenceContext(unitName = "tiendaudem__pm")
=======
 * @author Maritza
 */
@Stateless
public class UsuariosFacade extends AbstractFacade<Usuarios> {

    @PersistenceContext(unitName = "InventarioTiendaUdemPU")
>>>>>>> d62c4ae19cdfaff10d5664dd4e7e992b8a37facc
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuariosFacade() {
        super(Usuarios.class);
    }
<<<<<<< HEAD
=======

    public Usuarios iniciarSesion(Usuarios current) {
        Usuarios logg = null;
        String consulta ;
        
        try{//es importante mirar en las entitys creada de la tabla login como son las consultas
            consulta = "FROM Usuarios l WHERE l.username = ?1 and l.password = ?2";
            Query query = em.createQuery(consulta);
            query.setParameter(1, current.getUsername());
            query.setParameter(2, current.getPassword());
             
            List<Usuarios> lista = query.getResultList();
            //si se hace una consulta correctamente se optiene un logeo(username y password) de la clase Login
            if (lista.isEmpty()) {
            }else{
               logg = lista.get(0);
            }
        } catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(e.toString()));
            throw e;
        }
        return logg;
    }
>>>>>>> d62c4ae19cdfaff10d5664dd4e7e992b8a37facc
    
}
