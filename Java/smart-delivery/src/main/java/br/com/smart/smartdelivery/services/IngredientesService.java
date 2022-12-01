package br.com.smart.smartdelivery.services;

import br.com.smart.smartdelivery.dto.IngredientesDto;
import br.com.smart.smartdelivery.models.IngredientesModel;
import br.com.smart.smartdelivery.repositories.IngredientesRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class IngredientesService {

    final IngredientesRepository ingredientesRepository;

    public IngredientesService(IngredientesRepository ingredientesRepository) {
        this.ingredientesRepository = ingredientesRepository;
    }

    @Transactional
    public Object save(IngredientesModel ingredientesModel) {
        return ingredientesRepository.save(ingredientesModel);
    }

    public boolean existsIngrediente(String descricao) {
        return ingredientesRepository.existsByDescricao(descricao);
    }
}
