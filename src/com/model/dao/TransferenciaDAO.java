/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.connection.ConnectionFactory;
import com.model.bean.Gado;
import com.model.bean.Transferencia;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class TransferenciaDAO extends GenericDAOClass<Transferencia>{
            
        
        public List<Transferencia> findByCompra(){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Transferencia> transferencia = null;
        try{
            transferencia = em.createQuery("from Transferencia t where tipoTransferencia = 'Compra'").getResultList();
        }catch (Exception e){
         JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + e);   
        } finally {
            em.close();
        }
        
        return transferencia;
    }
        
        public List<Transferencia> findByVenda(){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Transferencia> transferencia = null;
        try{
            transferencia = em.createQuery("from Transferencia t where tipoTransferencia = 'Venda'").getResultList();
        }catch (Exception e){
         JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + e);   
        } finally {
            em.close();
        }
        
        return transferencia;
    }
        
    /*public List<Gado> findByMaiorId(){
        EntityManager em = new ConnectionFactory().getConnection();
        List<Gado> gado = null;
        try{
            gado = em.createQuery("select max(idGado) from gado g").getResultList();
        }catch (Exception e){
         JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + e);   
        } finally {
            em.close();
        }
        
        return gado;
    }*/

    
}
