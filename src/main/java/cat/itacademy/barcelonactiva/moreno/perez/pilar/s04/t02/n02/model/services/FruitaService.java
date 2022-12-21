package cat.itacademy.barcelonactiva.moreno.perez.pilar.s04.t02.n02.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.moreno.perez.pilar.s04.t02.n02.model.domain.Fruita;
import cat.itacademy.barcelonactiva.moreno.perez.pilar.s04.t02.n02.model.repository.FruitaRepository;


@Service
public class FruitaService {
	
	@Autowired
	FruitaRepository fruitaRepository;
	

    //Por defecto el repositorio al extender de JPA trae el metodo por defecto
    public List<Fruita> llistaFruites(){
        return  fruitaRepository.findAll();
    }

    public Optional<Fruita> getFruita(Long idFruita){
        return  fruitaRepository.findById(idFruita);
    }

    public void saveFruita(Fruita fruita) {
    	fruitaRepository.save(fruita);
    }
    
    public void deleteFruita(Long idFruita) {
    	fruitaRepository.deleteById(idFruita);
    }
    
}
