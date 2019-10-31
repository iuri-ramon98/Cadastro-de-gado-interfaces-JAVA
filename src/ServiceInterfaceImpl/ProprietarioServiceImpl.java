/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceInterfaceImpl;

import ServiceInterface.ProprietarioService;
import com.model.bean.Proprietario;
import com.model.dao.ProprietarioDAO;
import java.util.List;

/**
 *
 * @author User
 */
public class ProprietarioServiceImpl implements ProprietarioService{
    
    ProprietarioDAO dao = new ProprietarioDAO();
    
    @Override
    public void save(Proprietario proprietario) {
        dao.save(proprietario);
    }

    @Override
    public void update(Proprietario proprietario) {
        dao.update(proprietario);
    }

    @Override
    public void remove(Class<Proprietario> clazz, Integer id) {
        dao.remove(clazz, id);
    }

    @Override
    public List<Proprietario> FindALL(String clazz) {
       return dao.FindALL(clazz);
    }

    @Override
    public Proprietario findByID(Class<Proprietario> clazz, Integer id) {
        return (Proprietario)dao.findByID(clazz, id);
    }

    
}
