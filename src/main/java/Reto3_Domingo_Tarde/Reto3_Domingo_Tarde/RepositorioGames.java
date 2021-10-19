
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioGames {
    @Autowired
    private interfaceGames crud;
    
    public List<Games> getAll(){
        return (List<Games>) crud.findAll();
    }
    
    public Optional <Games> getGames(int id){
        return crud.findById(id);
    }
    
    public Games save(Games games){
        return crud.save(games);
    }
    
}
