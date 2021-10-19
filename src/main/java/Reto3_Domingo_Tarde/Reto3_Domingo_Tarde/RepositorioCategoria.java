
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioCategoria {
     @Autowired
    private interfaceCategoria crud;
    
    public List<Categoria> getAll(){
        return (List<Categoria>) crud.findAll();
    }
    
    public Optional <Categoria> getCategoria(int id){
        return crud.findById(id);
    }
    
    public Categoria save(Categoria categoria ){
        return crud.save(categoria);
    }
    
}
