package br.com.smart.smartdelivery.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class IngredientesDto {

    @NotNull
    private String descricao;

    @NotNull
    @NotBlank
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
