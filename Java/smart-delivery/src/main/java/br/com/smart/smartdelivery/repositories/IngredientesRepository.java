package br.com.smart.smartdelivery.repositories;

import br.com.smart.smartdelivery.models.IngredientesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IngredientesRepository extends JpaRepository<IngredientesModel, UUID> {

    boolean existsByDescricao(String descricao);


    }
