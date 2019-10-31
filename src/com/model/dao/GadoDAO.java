/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.connection.ConnectionFactory;
import com.model.bean.Gado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GadoDAO extends GenericDAOClass<Gado>{
    public List<Gado> findByPosse(){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Gado> gado = null;
        try{
            gado = em.createQuery("from Gado g where posse = 1").getResultList();
        }catch (Exception e){
         JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + e);   
        } finally {
            em.close();
        }
        
        return gado;
    }
    
}