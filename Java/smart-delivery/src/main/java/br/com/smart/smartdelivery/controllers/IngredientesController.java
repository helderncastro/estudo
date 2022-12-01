package br.com.smart.smartdelivery.controllers;

import br.com.smart.smartdelivery.dto.IngredientesDto;
import br.com.smart.smartdelivery.models.IngredientesModel;
import br.com.smart.smartdelivery.services.IngredientesService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/ingredientes")
public class IngredientesController {
    final IngredientesService ingredientesService;

    public IngredientesController(IngredientesService ingredientesService) {
        this.ingredientesService = ingredientesService;
    }

    @PostMapping
    public ResponseEntity<Object> saveIngredientes(@RequestBody @Valid IngredientesDto ingredientesDto) {
        var ingredientesModel = new IngredientesModel();

        if (ingredientesService.existsIngrediente(ingredientesDto.getDescricao())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Ingrediente Já existente");
        }

        BeanUtils.copyProperties(ingredientesDto, ingredientesModel );
        return ResponseEntity.status(HttpStatus.CREATED).body(ingredientesService.save(ingredientesModel));

    }

}
