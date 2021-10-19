
package Reto3_Domingo_Tarde.Reto3_Domingo_Tarde;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Game")
public class GamesWeb {
    @GetMapping("/holaMundo")
    public String saludar(){
        return "Hola Mundo Colombia";
    }
    
    @Autowired
    private serviciosGames servicios;
    @GetMapping("/all")
    public List <Games> getGames(){
        return servicios.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Games> getGames(@PathVariable("id") int idGames){
        return servicios.getGames(idGames);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Games save(@RequestBody Games games){
        return servicios.save(games);
    }
}
