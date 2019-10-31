/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceInterface;

import com.model.bean.Transferencia;
import java.util.List;

/**
 *
 * @author User
 */
public interface TransferenciaService {
    
    public void save(Transferencia transferencia);
    
    public void update(Transferencia transferencia);
    
    public void remove(Class<Transferencia> clazz, Integer id);
    
    public List<Transferencia> FindALL(String clazz);
    
    public Transferencia findByID(Class<Transferencia> clazz, Integer id);
    
    public List<Transferencia> findByCompra();
    
    public List<Transferencia> findByVenda();
    
}
