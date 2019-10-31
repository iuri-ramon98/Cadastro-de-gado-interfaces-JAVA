/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceInterface;

import com.model.bean.Gado;
import java.util.List;

/**
 *
 * @author User
 */
public interface GadoService {
    
    public void save(Gado gado);
    public void update(Gado gado);
    public void remove(Class<Gado> clazz, Integer Id);
    public List<Gado> FindALL(String clazz);
    public Gado findByID(Class<Gado> clazz, Integer id);
    public List<Gado> findByPosse();  
    
}
