/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceInterfaceImpl;

import ServiceInterface.GadoService;
import com.model.bean.Gado;
import com.model.dao.GadoDAO;
import java.util.List;

/**
 *
 * @author User
 */
public class GadoServiceImpl implements GadoService{
    
    GadoDAO dao = new GadoDAO();
    
    @Override
    public void save(Gado gado) {
        dao.save(gado);
    }

    @Override
    public void update(Gado gado) {
        dao.update(gado);
    }

    @Override
    public void remove(Class<Gado> clazz, Integer id) {
        dao.remove(clazz, id);
    }

    @Override
    public List<Gado> FindALL(String clazz) {
       return dao.FindALL(clazz);
    }

    @Override
    public Gado findByID(Class<Gado> clazz, Integer id) {
        return (Gado)dao.findByID(clazz, id);
    }
    
    public List<Gado> findByPosse(){
        return dao.findByPosse();
    }
   
    
}
