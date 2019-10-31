/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceInterface;


import com.model.bean.Proprietario;
import java.util.List;

/**
 *
 * @author User
 */
public interface ProprietarioService {
   
    public void save(Proprietario proprietario);
    public void update(Proprietario proprietario);
    public void remove(Class<Proprietario> clazz, Integer Id);
    public List<Proprietario> FindALL(String clazz);
    public Proprietario findByID(Class<Proprietario> clazz, Integer id);   
}
