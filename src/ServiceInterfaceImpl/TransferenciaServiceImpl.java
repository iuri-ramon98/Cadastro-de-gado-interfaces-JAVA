/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceInterfaceImpl;

import ServiceInterface.TransferenciaService;
import com.model.bean.Transferencia;
import com.model.dao.TransferenciaDAO;
import java.util.List;

/**
 *
 * @author User
 */
public class TransferenciaServiceImpl implements TransferenciaService{
    
    TransferenciaDAO dao = new TransferenciaDAO();
    
    @Override
    public void save(Transferencia transferencia) {
        dao.save(transferencia);
    }

    @Override
    public void update(Transferencia transferencia) {
        dao.update(transferencia);
    }

    @Override
    public void remove(Class<Transferencia> clazz, Integer id) {
        dao.remove(clazz, id);
    }

    @Override
    public List<Transferencia> FindALL(String clazz) {
        return dao.FindALL(clazz);
    }

    @Override
    public Transferencia findByID(Class<Transferencia> clazz, Integer id) {
        return (Transferencia) dao.findByID(clazz, id);
    }
    
    @Override
    public List<Transferencia> findByCompra(){
        return dao.findByCompra();
    }
    
    @Override
    public List<Transferencia> findByVenda(){
        return dao.findByVenda();
    }
    
}
