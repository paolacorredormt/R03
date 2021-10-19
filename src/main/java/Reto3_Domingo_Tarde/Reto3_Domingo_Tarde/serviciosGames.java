
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class serviciosGames {
    
    @Autowired
    private RepositorioGames metodosCrud;
    
    public List<Games> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Games> getGames(int idGames){
        return metodosCrud.getGames(idGames);
    }
    
    public Games save(Games games){
         if(games.getIdGames()==null){
            return metodosCrud.save(games);
        }else{
            Optional<Games> evt=metodosCrud.getGames(games.getIdGames());
            if(evt.isEmpty()){
            return metodosCrud.save(games);
            }else{
                return games;
            }
        
        }
    }
    
}
